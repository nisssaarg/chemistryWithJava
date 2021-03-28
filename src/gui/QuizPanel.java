package gui;

import listeners.BackListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.ExecutionException;

public class QuizPanel extends JPanel implements ActionListener {

    private final JButton back;
    private final QuizHolderPanel quizHolder;
    private BackListener backListener;

    public QuizPanel() throws ExecutionException, InterruptedException {
        back = new JButton("Back");
        back.addActionListener(this);
        quizHolder = new QuizHolderPanel();

        setLayout(new BorderLayout());
        add(back, BorderLayout.SOUTH);
        add(quizHolder);
    }

    public void setBackListener(BackListener backListener) {
        this.backListener = backListener;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (backListener != null) {
            backListener.onBackClick();
        }
    }
}
