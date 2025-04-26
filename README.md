# 📊 Social Media Content Management and Analytics Platform

## Overview
This project is a Java-based **Object-Oriented Programming (OOP)** system for social media content scheduling, analytics tracking, and AI-driven optimization. Designed for influencers, brands, and marketers, it helps automate posting and generate actionable insights across multiple platforms.

---

## 🚀 Features
- Give optimum time for posting content based on its type.
- Track engagement metrics (likes, shares, comments, follower growth).
- Sentiment analysis for user interactions.
- Hashtag performance analysis.
- Role-based access system (Admin, Content Creator, Marketing Analyst).
- Data visualization through CSV output for graphs/charts.
- AI-driven content and posting time recommendations.

---

## 📦 Project Structure

| Folder/File | Description |
| :--- | :--- |
| `com/` | Java source files (organized into model, service, integration, util, and exception packages) |
| `analytics_results.csv` | Output file for analyzed metrics |
| `social_media_data.csv` | Input data file for social media posts and engagement |

---

## 📚 Key Java Concepts Implemented

- **Classes**: Organized into Scheduler, Post, Analytics, SentimentAnalyzer, User (abstract), etc.
- **Overloading**: Methods and constructors for posting and tracking metrics.
- **Varargs Overloading**: For hashtags and platform selections.
- **Nested Class**: Used within Post for metadata.
- **Abstract Class**: `User` class.
- **Interface**: `PlatformIntegration` for API simulations.
- **Hierarchical Inheritance**: Admin, ContentCreator, MarketingAnalyst from User.
- **Multiple Inheritance**: Through interfaces.
- **Wrappers**: Integer, Double used in engagement tracking.
- **Package Usage**: Clean modular architecture (`com.socialmedia.management`).
- **Exception Handling**: For invalid roles and API failures.
- **File I/O**: Scanner for input; FileReader/Writer for CSV files.
 
---

## 🛠 How to Run

1. Clone the repository:
   ```bash
   git clone https://github.com/AryanPhanse/OOPS_PROJECT.git
   ```

2. Compile the Java files:
   ```bash
   javac com/socialmedia/management/**/*.java
   ```

3. Run the main class:
   ```bash
   java com.socialmedia.management.Main
   ```

---

## 📈 Sample Output
- `analytics_results.csv`: Contains analyzed performance metrics.
- Sentiment scores, follower growth, and competitor analysis printed to console.

---

## 👨‍💻 Future Enhancements
- Real-time dashboard using JavaFX or Spring Boot.
- OAuth authentication with social platforms.
- AI-based content recommendations via machine learning.

---

> 📎 [View Project Repository](https://github.com/AryanPhanse/OOPS_PROJECT)

---
