package gui;

import Database.DatabaseConnector;
import listeners.QuizNumberListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class QuizesPanel extends JPanel implements ActionListener {

    JLabel title;
    JButton quizButton;
    private int numberOfQuiz;
    private QuizNumberListener quizNumberListener;

    public QuizesPanel() throws ExecutionException, InterruptedException {
        title = new JLabel("Select Your Quiz Number");
        title.setFont(new Font("Open Sans", Font.BOLD, 28));

        setLayout(new GridBagLayout());

        GridBagConstraints gc = new GridBagConstraints();
        gc.fill = GridBagConstraints.VERTICAL;
        gc.anchor = GridBagConstraints.FIRST_LINE_START;
        gc.weightx = 1;
        gc.gridy = 0;
        gc.gridx = 0;

        gc.insets = new Insets(10, 5, 30, 5);
        add(title, gc);

        gc.insets = new Insets(0, 5, 10, 5);
        Future<Integer> future = getNumberOfQuiz();
        for (int i = 0; i < future.get(); ++i) {
            ++gc.gridy;
            quizButton = new JButton(String.valueOf(i + 1));

            Dimension preferred = quizButton.getPreferredSize();
            preferred.width = 60;
            preferred.height = 60;
            quizButton.setPreferredSize(preferred);
            quizButton.setMinimumSize(preferred);
            quizButton.addActionListener(this);
            quizButton.setFont(new Font("Open Sans", Font.BOLD, 20));
            add(quizButton, gc);
        }

        ++gc.gridy;
        gc.weighty = 2;
        add(new JLabel(""), gc);

    }

    private Future<Integer> getNumberOfQuiz() {
        ExecutorService service = Executors.newSingleThreadExecutor();
        Future<Integer> future = service.submit(() -> {
            try {
                DatabaseConnector connector = DatabaseConnector.getInstance();
                Connection connection = connector.getConnection();
                if (connection != null) {
                    PreparedStatement statement = connection.prepareStatement("SELECT COUNT(DISTINCT quiz_id) from questions");
                    ResultSet rs = statement.executeQuery();
                    while (rs.next()) {
                        numberOfQuiz = rs.getInt(1);
                    }
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return numberOfQuiz;
        });
        service.shutdown();
        return future;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (quizNumberListener != null) {
            JButton button = (JButton) actionEvent.getSource();
            quizNumberListener.quizSelected(button.getText());
        }
    }

    public void setQuizNumberListener(QuizNumberListener quizNumberListener) {
        this.quizNumberListener = quizNumberListener;
    }
}
