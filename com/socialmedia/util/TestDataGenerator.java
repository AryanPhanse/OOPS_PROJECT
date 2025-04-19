package com.socialmedia.util;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Random;

public class TestDataGenerator {
    public static void main(String[] args) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("social_media_data.csv"))) {
            writer.write("profile_name,post_id,post_date,post_time,likes,shares,followers,comments,content_type,comment_text\n");
            Random random = new Random();
            String[] contentTypes = {"PHOTO", "VIDEO", "REEL", "TEXT"};
            String[] positiveComments = {
                "Great post!", "Love this content!", "Amazing work!", "Very helpful, thanks!",
                "This is excellent!", "Keep it up!", "Awesome content!", "So inspiring!"
            };
            String[] negativeComments = {
                "Not very helpful", "Could be better", "I don't agree", "Disappointing content",
                "This is misleading", "Not what I expected", "Too basic", "Needs improvement"
            };
            String[] mixedComments = {
                "Good but could be better", "Interesting content but too short",
                "I like the idea but execution needs work", "Some good points but missing details",
                "Nice attempt but needs more depth", "Has potential but needs refinement"
            };
            for (int profileId = 1; profileId <= 50; profileId++) {
                String profileName = "profile" + profileId;
                int postCount = random.nextInt(26) + 25;
                int baseFollowers = random.nextInt(5000) + 1000;
                for (int postId = 1; postId <= postCount; postId++) {
                    LocalDate postDate = LocalDate.now().minusDays(random.nextInt(365));
                    LocalTime postTime = LocalTime.of(random.nextInt(24), random.nextInt(60));
                    int likes = random.nextInt(1000);
                    int shares = random.nextInt(200);
                    int followers = baseFollowers + (postId * random.nextInt(100));
                    int comments = random.nextInt(50);
                    String contentType = contentTypes[random.nextInt(contentTypes.length)];
                    String commentText;
                    double likeRatio = followers > 0 ? (double) likes / followers : 0;
                    if (likeRatio > 0.1) {
                        commentText = positiveComments[random.nextInt(positiveComments.length)];
                    } else if (likeRatio < 0.05) {
                        commentText = negativeComments[random.nextInt(negativeComments.length)];
                    } else {
                        commentText = mixedComments[random.nextInt(mixedComments.length)];
                    }
                    writer.write(String.format("%s,post%d,%s,%s,%d,%d,%d,%d,%s,\"%s\"\n",
                            profileName, postId, postDate, postTime, likes, shares, 
                            followers, comments, contentType, commentText));
                }
            }
            System.out.println("Test data generated successfully: social_media_data.csv");
        } catch (IOException e) {
            System.err.println("Error generating test data: " + e.getMessage());
        }
    }
}
