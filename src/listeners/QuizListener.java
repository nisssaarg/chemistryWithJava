package listeners;

import java.util.concurrent.ExecutionException;

public interface QuizListener {
    void onQuizSelected() throws ExecutionException, InterruptedException;
}
