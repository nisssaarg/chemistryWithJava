package gui;

import Database.DatabaseConnector;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class QuestionsPanel extends JPanel implements ItemListener, ActionListener {

    private final ButtonGroup questionGroup;
    private final JRadioButton option1;
    private final JRadioButton option2;
    private final JRadioButton option3;
    private final JRadioButton option4;
    private final JLabel status;
    private final JLabel description;
    private final JLabel totalScoreLabel;
    private final JButton next;
    JLabel question;
    private String answer;
    private String descriptionValue;
    private int totalScore;
    private DatabaseConnector connector;
    private Connection connection;
    private int questionNumber;
    private int quizNumber;

    public QuestionsPanel(String quizNumber) {
        question = new JLabel("");
        questionGroup = new ButtonGroup();
        option1 = new JRadioButton("");
        option2 = new JRadioButton("");
        option3 = new JRadioButton("");
        option4 = new JRadioButton("");
        questionGroup.add(option1);
        questionGroup.add(option2);
        questionGroup.add(option3);
        questionGroup.add(option4);
        status = new JLabel("Status: ");
        description = new JLabel("Description: ");
        next = new JButton("Next");
        totalScoreLabel = new JLabel("");
        totalScoreLabel.setFont(new Font("Open Sans", Font.BOLD, 20));

        question.setFont(new Font("Open Sans", Font.BOLD, 20));
        option1.setFont(new Font("Open Sans", Font.PLAIN, 20));
        option2.setFont(new Font("Open Sans", Font.PLAIN, 20));
        option3.setFont(new Font("Open Sans", Font.PLAIN, 20));
        option4.setFont(new Font("Open Sans", Font.PLAIN, 20));
        status.setFont(new Font("Open Sans", Font.BOLD, 20));
        description.setFont(new Font("Open Sans", Font.BOLD, 20));

        next.addActionListener(this);
        option1.addItemListener(this);
        option2.addItemListener(this);
        option3.addItemListener(this);
        option4.addItemListener(this);

        setLayout(new GridBagLayout());
        displayData(quizNumber);
    }

    private void displayData(String quizNumber) {
        try {
            connector = DatabaseConnector.getInstance();
            connection = connector.getConnection();
            if (connection != null) {
                PreparedStatement statement = connection.prepareStatement("SELECT * from questions WHERE quiz_id = ?"
                        + " AND question_id = ?");
                statement.setInt(1, Integer.parseInt(quizNumber));
                ++this.questionNumber;
                statement.setInt(2, questionNumber);
                ResultSet rs = statement.executeQuery();
                while (rs.next()) {
                    this.quizNumber = rs.getInt("quiz_id");
                    question.setText(rs.getString("question_id") + ". " + rs.getString("question"));
                    option1.setText(rs.getString("option1"));
                    option2.setText(rs.getString("option2"));
                    option3.setText(rs.getString("option3"));
                    option4.setText(rs.getString("option4"));
                    descriptionValue = rs.getString("description");
                    answer = rs.getString("answer");
                }
            }
        } catch (SQLException e) {
            System.out.println("Incorrect SQL Query");
        } catch (NumberFormatException e) {
            System.out.println("Invalid quiz number");
        }

        GridBagConstraints gc = new GridBagConstraints();
        gc.fill = GridBagConstraints.VERTICAL;
        gc.anchor = GridBagConstraints.FIRST_LINE_START;
        gc.weightx = 1;
        gc.gridy = 0;
        gc.gridx = 0;

        gc.insets = new Insets(20, 15, 15, 15);
        add(question, gc);

        ++gc.gridy;
        gc.insets = new Insets(0, 15, 10, 15);
        add(option1, gc);

        ++gc.gridy;
        gc.insets = new Insets(0, 15, 10, 15);
        add(option2, gc);

        ++gc.gridy;
        gc.insets = new Insets(0, 15, 10, 15);
        add(option3, gc);

        ++gc.gridy;
        gc.insets = new Insets(0, 15, 30, 15);
        add(option4, gc);

        ++gc.gridy;
        gc.insets = new Insets(0, 15, 15, 15);
        add(status, gc);

        ++gc.gridy;
        gc.insets = new Insets(0, 15, 20, 15);
        add(description, gc);

        ++gc.gridy;
        gc.insets = new Insets(0, 15, 30, 15);
        add(next, gc);

        ++gc.gridy;
        gc.weighty = 2;
        gc.fill = GridBagConstraints.NONE;
        gc.anchor = GridBagConstraints.FIRST_LINE_START;
        gc.insets = new Insets(0, 15, 10, 15);
        add(totalScoreLabel, gc);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

        if (questionGroup.getSelection() == null) {
            return;
        }

        if (option1.isSelected() && option1.getText().equals(answer)) {
            ++totalScore;
        } else if (option2.isSelected() && option2.getText().equals(answer)) {
            ++totalScore;
        } else if (option3.isSelected() && option3.getText().equals(answer)) {
            ++totalScore;
        } else if (option4.isSelected() && option4.getText().equals(answer)) {
            ++totalScore;
        }

        try {
            ++this.questionNumber;
            if (connection != null) {
                PreparedStatement statement = connection.prepareStatement("SELECT * from questions WHERE quiz_id = ?"
                        + " AND question_id = ?");
                statement.setInt(1, this.quizNumber);
                statement.setInt(2, this.questionNumber);
                ResultSet rs = statement.executeQuery();
                boolean hasRow = rs.next();
                if (hasRow) {
                    clearChoice();
                    setChoiceSelection(true);
                    status.setText("Status: ");
                    description.setText("Description: ");
                    while (hasRow) {
                        question.setText(rs.getString("question_id") + ". " + rs.getString("question"));
                        option1.setText(rs.getString("option1"));
                        option2.setText(rs.getString("option2"));
                        option3.setText(rs.getString("option3"));
                        option4.setText(rs.getString("option4"));
                        descriptionValue = rs.getString("description");
                        answer = rs.getString("answer");
                        hasRow = rs.next();
                    }
                } else {
                    next.setEnabled(false);
                    setChoiceSelection(false);
                    totalScoreLabel.setText("Score: " + totalScore);
                }
            }

        } catch (Exception m) {
            System.out.println(m.getMessage());
        }


    }

    private void clearChoice() {
        questionGroup.clearSelection();
    }

    @Override
    public void itemStateChanged(ItemEvent itemEvent) {
        JRadioButton button = (JRadioButton) itemEvent.getSource();
        if (button.getText().equals(answer)) {
            status.setText("Status: Correct");
        } else {
            status.setText("Status: Incorrect. Correct answer is " + answer);
        }
        description.setText("Description: " + descriptionValue);
        setChoiceSelection(false);
    }

    private void setChoiceSelection(boolean enabled) {
        option1.setEnabled(enabled);
        option2.setEnabled(enabled);
        option3.setEnabled(enabled);
        option4.setEnabled(enabled);
    }
}
