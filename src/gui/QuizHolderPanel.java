package gui;

import javax.swing.*;
import java.awt.*;
import java.util.concurrent.ExecutionException;

public class QuizHolderPanel extends JPanel {
    private final QuizesPanel quizesPanel;
    private QuestionsPanel questionsPanel;

    public QuizHolderPanel() throws ExecutionException, InterruptedException {
        quizesPanel = new QuizesPanel();
        JSplitPane panels = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, new JScrollPane(quizesPanel), null);

        Dimension preferred = quizesPanel.getPreferredSize();
        preferred.width = 400;
        quizesPanel.setPreferredSize(preferred);
        quizesPanel.setMinimumSize(preferred);

        quizesPanel.setQuizNumberListener(quizNumber -> {
            System.out.println("Quiz Number selected: " + quizNumber);
            questionsPanel = new QuestionsPanel(quizNumber);
            questionsPanel.setVisible(true);
            panels.setRightComponent(new JScrollPane(questionsPanel));
        });


        setLayout(new BorderLayout());
        panels.setOneTouchExpandable(true);
        add(panels, BorderLayout.CENTER);

    }


}
