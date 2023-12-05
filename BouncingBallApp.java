import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class BouncingBallApp extends Application {

    private static final int WIDTH = 600;
    private static final int HEIGHT = 400;
    private static final int BALL_RADIUS = 20;
    private static final int GRAVITY = 2;

    private double ballYSpeed = 0;

    @Override
    public void start(Stage primaryStage) {
        Circle ball = new Circle(BALL_RADIUS, Color.BLUE);
        ball.relocate(WIDTH / 2 - BALL_RADIUS, HEIGHT / 2 - BALL_RADIUS);

        Pane pane = new Pane(ball);

        Timeline timeline = new Timeline(new KeyFrame(Duration.millis(16), event -> {
            updateBallPosition(ball);
        }));
        timeline.setCycleCount(Timeline.INDEFINITE);

        pane.setOnMouseClicked(event -> {
            if (ball.getTranslateY() == HEIGHT - BALL_RADIUS) {
                // Only allow jumping when the ball is on the ground
                ballYSpeed = -30;
            }
        });

        Scene scene = new Scene(pane, WIDTH, HEIGHT);

        primaryStage.setTitle("Bouncing Ball");
        primaryStage.setScene(scene);
        primaryStage.show();

        timeline.play();
    }

    private void updateBallPosition(Circle ball) {
        // Update the vertical position of the ball based on its speed
        ball.setTranslateY(ball.getTranslateY() + ballYSpeed);

        // Update the speed of the ball due to gravity
        ballYSpeed += GRAVITY;

        // Ensure the ball stays within the window boundaries
        if (ball.getTranslateY() >= HEIGHT - BALL_RADIUS) {
            ball.setTranslateY(HEIGHT - BALL_RADIUS);
            ballYSpeed = 0; // Stop the ball from going further down
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}