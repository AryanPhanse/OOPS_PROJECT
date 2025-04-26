package com.socialmedia.service;

import java.util.Date;

public class Scheduler {

    // Overloaded method 1: Schedule post with only content
    public void schedulePost(String content) {
        System.out.println("Post scheduled with content: \"" + content + "\" for immediate posting.");
    }

    // Overloaded method 2: Schedule post with content and specific time
    public void schedulePost(String content, String scheduledTime) {
        System.out.println("Post scheduled with content: \"" + content + "\" at " + scheduledTime);
    }

    // Varargs method: Schedule post to multiple platforms
    public void schedulePost(String content, String... platforms) {
        System.out.println("Post \"" + content + "\" scheduled on platforms:");
        for (String platform : platforms) {
            System.out.println("- " + platform);
        }
    }

    // Static nested class for scheduled post details
    public static class ScheduledPostDetails {
        private String content;
        private Date scheduledDate;

        public ScheduledPostDetails(String content, Date scheduledDate) {
            this.content = content;
            this.scheduledDate = scheduledDate;
        }

        public void displayDetails() {
            System.out.println("Content: " + content + ", Scheduled At: " + scheduledDate);
        }
    }
}
