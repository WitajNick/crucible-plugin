package core.listeners;

import com.atlassian.event.EventListener;
import com.atlassian.crucible.event.ReviewCompletionEvent;

public class ReviewClosedEventListener implements EventListener {
    public void handleEvent(Event event) {
        ReviewCompletionEvent reviewCompletionEvent = (ReviewCompletionEvent) event;
        Review reviewId = reviewCompletionEvent.getReviewId();
        // Do something with the review
        URL url = new URL("https://aws.amazon.com?reviewId=" + reviewId);

        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("POST");
        con.getResponseCode();
    }
    public Class[] getHandledEventClasses() {
        return new Class[] { ReviewCompletionEvent.class };
    }
}
