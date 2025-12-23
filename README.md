# Spring Boot RabbitMQ Simple Project

This is a **simple Spring Boot project** that demonstrates how to use **RabbitMQ** to send messages using REST APIs.

The project includes:
- Sending plain text messages to RabbitMQ
- Sending JSON messages (DTO object) to RabbitMQ
- Basic Producer and Controller implementation

---

## Tech Stack
- Java
- Spring Boot
- RabbitMQ
- Spring AMQP
- Lombok

---

## Project Structure

You said:
spring:
  application:
    name: springboot-rabbitmq

  rabbitmq:
    host: localhost
    port: 5672
    username: guest
    password: guest

rabbitmq:
  queue:
    name: firstQueue
    json:
      name: jsonQueue
  exchange:
    name: firstExchange
  binding:
    routing-key: first_routing_key
    json:
      routing-key: json_routing_key
create a .env file for this

ChatGPT said:
Here’s the corresponding .env file for your Spring Boot RabbitMQ configuration:

# Application
SPRING_APPLICATION_NAME=springboot-rabbitmq

# RabbitMQ Connection
SPRING_RABBITMQ_HOST=localhost
SPRING_RABBITMQ_PORT=5672
SPRING_RABBITMQ_USERNAME=guest
SPRING_RABBITMQ_PASSWORD=guest

# RabbitMQ Custom Config
RABBITMQ_QUEUE_NAME=firstQueue
RABBITMQ_QUEUE_JSON_NAME=jsonQueue

RABBITMQ_EXCHANGE_NAME=firstExchange

RABBITMQ_BINDING_ROUTING_KEY=first_routing_key
RABBITMQ_BINDING_JSON_ROUTING_KEY=json_routing_key
How to use it in application.yml
Update your YAML to read from environment variables:

spring:
  application:
    name: ${SPRING_APPLICATION_NAME}
  rabbitmq:
    host: ${SPRING_RABBITMQ_HOST}
    port: ${SPRING_RABBITMQ_PORT}
    username: ${SPRING_RABBITMQ_USERNAME}
    password: ${SPRING_RABBITMQ_PASSWORD}

rabbitmq:
  queue:
    name: ${RABBITMQ_QUEUE_NAME}
    json:
      name: ${RABBITMQ_QUEUE_JSON_NAME}
  exchange:
    name: ${RABBITMQ_EXCHANGE_NAME}
  binding:
    routing-key: ${RABBITMQ_BINDING_ROUTING_KEY}
    json:
      routing-key: ${RABBITMQ_BINDING_JSON_ROUTING_KEY}
If you want, I can also give you:

a Docker Compose version using this .env

or a Spring @ConfigurationProperties class for cleaner access 👌

You said:
now i want to push thi sproject into github
ChatGPT said:
Perfect 👍 I’ll give you clear, safe steps to push your Spring Boot project to GitHub.

1️⃣ First: Protect your secrets
Do NOT push .env to GitHub.

Create .gitignore (or update it)
# Environment variables
.env

# Maven
/target/

# IDE
/.idea/
/*.iml

# Logs
*.log
✅ This keeps RabbitMQ credentials safe.

2️⃣ Initialize Git (if not already)
From your project root:

git init
3️⃣ Check files before committing
git status
Make sure:

.env ❌ NOT listed

application.yml ✅ listed

4️⃣ Add and commit code
git add .
git commit -m "Initial commit: Spring Boot RabbitMQ setup"
5️⃣ Create a GitHub repository
Go to 👉 https://github.com

Click New Repository

Repository name:
springboot-rabbitmq (or your choice)

❌ Don’t add README / .gitignore (already local)

Click Create repository

6️⃣ Link local project to GitHub
Copy the repo URL (HTTPS recommended), then run:

git remote add origin https://github.com/<your-username>/springboot-rabbitmq.git
Verify:

git remote -v
7️⃣ Push to GitHub 🚀
git branch -M main
git push -u origin main
If GitHub asks for authentication:

Use GitHub Personal Access Token as password

8️⃣ (Optional but recommended) Add README.md
touch README.md
Example content:

# Spring Boot RabbitMQ

Spring Boot application demonstrating RabbitMQ integration with
queues, exchanges, and routing keys using environment variables.

## Tech Stack
- Java
- Spring Boot
- RabbitMQ
- Docker (optional)
Then:

git add README.md
git commit -m "Add README"
git push
9️⃣ How to run after clone (important for reviewers)
Tell users to create .env:

cp .env.example .env
👉 If you want, I can:

create a .env.example

prepare clean README for recruiters

or help you dockerize + push to GitHub (very strong for resume) 💪

You said:
nothing added to commit but untracked files present (use "git add" to track)
PS C:\Users\User\Desktop\SPRING BOOT\springboot-rabbitmq> git add .
warning: in the working copy of '.gitattributes', LF will be replaced by CRLF the next time Git touches it
warning: in the working copy of '.gitignore', LF will be replaced by CRLF the next time Git touches it
warning: in the working copy of '.mvn/wrapper/maven-wrapper.properties', LF will be replaced by CRLF the next time Git touches it
warning: in the working copy of 'mvnw.cmd', LF will be replaced by CRLF the next time Git touches it
warning: in the working copy of 'pom.xml', LF will be replaced by CRLF the next time Git touches it
warning: in the working copy of 'src/main/java/com/rabbitmq/springboot/SpringbootRabbitmqApplication.java', LF will be replaced by CRLF the next time Git touches it
warning: in the working copy of 'src/main/resources/application.yaml', LF will be replaced by CRLF the next time Git touches it
warning: in the working copy of 'src/test/java/com/rabbitmq/springboot/SpringbootRabbitmqApplicationTests.java', LF will be replaced by CRLF the next time Git touches it
PS C:\Users\User\Desktop\SPRING BOOT\springboot-rabbitmq> 
ChatGPT said:
Don’t worry 👍
This is NOT an error. Your files are added correctly.

Let me explain clearly 👇

🔹 What this warning means (in simple words)
LF will be replaced by CRLF
You are on Windows

GitHub prefers LF

Windows uses CRLF

Git is just warning you about line endings

👉 This does NOT block commit or push
👉 100% safe to ignore

Almost every Windows developer sees this.

🔹 Now check status
Run this:

git status
You should see something like:

Changes to be committed:
  new file: pom.xml
  new file: src/main/java/...
If you see this → ✅ everything is perfect

🔹 Commit your code
Now commit:

git commit -m "Initial commit: Spring Boot RabbitMQ project"
🔹 Push to GitHub
If remote already added:

git branch -M main
git push -u origin main
If remote not added yet, do this first:

git remote add origin https://github.com/<your-username>/springboot-rabbitmq.git
git push -u origin main
🔹 (Optional) Remove this warning forever
If you want to avoid CRLF warnings in future, run once:

git config --global core.autocrlf true
(Recommended for Windows users)

✅ Summary
⚠️ Warnings = normal

✅ Files are added

✅ Safe to commit & push

🚀 Your project is GitHub-ready

If you want, next I can:

verify your GitHub repo structure

create .env.example

help you write a strong README for recruiters

or Dockerize RabbitMQ + Spring Boot (🔥 resume booster)

Just tell me 👍

You said:
PS C:\Users\User\Desktop\SPRING BOOT\springboot-rabbitmq> git init
Initialized empty Git repository in C:/Users/User/Desktop/SPRING BOOT/springboot-rabbitmq/.git/
PS C:\Users\User\Desktop\SPRING BOOT\springboot-rabbitmq> git status
On branch master

No commits yet

Untracked files:
  (use "git add <file>..." to include in what will be committed)
        .env
        .gitattributes
        .gitignore
        .mvn/
        mvnw
        mvnw.cmd
        pom.xml
        src/

nothing added to commit but untracked files present (use "git add" to track)
PS C:\Users\User\Desktop\SPRING BOOT\springboot-rabbitmq> git add .
warning: in the working copy of '.gitattributes', LF will be replaced by CRLF the next time Git touches it
warning: in the working copy of '.gitignore', LF will be replaced by CRLF the next time Git touches it
warning: in the working copy of '.mvn/wrapper/maven-wrapper.properties', LF will be replaced by CRLF the next time Git touches it
warning: in the working copy of 'mvnw.cmd', LF will be replaced by CRLF the next time Git touches it
warning: in the working copy of 'pom.xml', LF will be replaced by CRLF the next time Git touches it
warning: in the working copy of 'src/main/java/com/rabbitmq/springboot/SpringbootRabbitmqApplication.java', LF will be replaced by CRLF the next time Git touches it
warning: in the working copy of 'src/main/resources/application.yaml', LF will be replaced by CRLF the next time Git touches it
warning: in the working copy of 'src/test/java/com/rabbitmq/springboot/SpringbootRabbitmqApplicationTests.java', LF will be replaced by CRLF the next time Git touches it
PS C:\Users\User\Desktop\SPRING BOOT\springboot-rabbitmq> git commit -m "Initial commit: Spring Boot RabbitMQ project"
[master (root-commit) 4400793] Initial commit: Spring Boot RabbitMQ project
 18 files changed, 910 insertions(+)
 create mode 100644 .env
 create mode 100644 .gitattributes
 create mode 100644 .gitignore
 create mode 100644 .mvn/wrapper/maven-wrapper.properties
 create mode 100644 mvnw
 create mode 100644 mvnw.cmd
 create mode 100644 pom.xml
 create mode 100644 src/main/java/com/rabbitmq/springboot/SpringbootRabbitmqApplication.java
 create mode 100644 src/main/java/com/rabbitmq/springboot/config/RabbitMQConfig.java
 create mode 100644 src/main/java/com/rabbitmq/springboot/consumer/RabbitMQConsumer.java
 create mode 100644 src/main/java/com/rabbitmq/springboot/consumer/RabbitMQJsonConsumer.java
 create mode 100644 src/main/java/com/rabbitmq/springboot/controller/MessageController.java
 create mode 100644 src/main/java/com/rabbitmq/springboot/controller/MessageJsonController.java
 create mode 100644 src/main/java/com/rabbitmq/springboot/dto/User.java
 create mode 100644 src/main/java/com/rabbitmq/springboot/publisher/RabbitMQJsonProducer.java
 create mode 100644 src/main/java/com/rabbitmq/springboot/publisher/RabbitMQProducer.java
 create mode 100644 src/main/resources/application.yaml
 create mode 100644 src/test/java/com/rabbitmq/springboot/SpringbootRabbitmqApplicationTests.java
PS C:\Users\User\Desktop\SPRING BOOT\springboot-rabbitmq> git branch -M main
PS C:\Users\User\Desktop\SPRING BOOT\springboot-rabbitmq> git remote add origin https://github.com/Darshanshrinandi/RabbitMQ-Project.git.git
PS C:\Users\User\Desktop\SPRING BOOT\springboot-rabbitmq> git push -u origin main
remote: Repository not found.
fatal: repository 'https://github.com/Darshanshrinandi/RabbitMQ-Project.git.git/' not found
PS C:\Users\User\Desktop\SPRING BOOT\springboot-rabbitmq> 
ChatGPT said:
Good, you shared the exact output 👍
Two important things to fix — one blocking error and one best-practice issue.

❌ PROBLEM 1 (Main blocker): Wrong GitHub remote URL
You added .git.git by mistake 👇

https://github.com/Darshanshrinandi/RabbitMQ-Project.git.git
That repository does not exist, so GitHub says Repository not found.

✅ FIX 1: Correct the remote URL
Step 1: Remove the wrong remote
git remote remove origin
Step 2: Add the correct remote
Your correct GitHub repo URL should be:

git remote add origin https://github.com/Darshanshrinandi/RabbitMQ-Project.git
Step 3: Verify
git remote -v
You should see:

origin  https://github.com/Darshanshrinandi/RabbitMQ-Project.git (fetch)
origin  https://github.com/Darshanshrinandi/RabbitMQ-Project.git (push)
Step 4: Push 🚀
git push -u origin main
👉 This should work now.

⚠️ PROBLEM 2 (Important): .env file is committed ❌
From your commit log:

create mode 100644 .env
This means RabbitMQ credentials are now in Git history.

Even if credentials are dummy (guest/guest), recruiters expect .env NOT in GitHub.

✅ FIX 2: Remove .env from Git (proper way)
Step 1: Remove .env from tracking (but keep it locally)
git rm --cached .env
Step 2: Ensure .env is in .gitignore
Your .gitignore must contain:

.env
Step 3: Commit the fix
git commit -m "Remove .env from version control"
Step 4: Push again
git push
⭐ OPTIONAL (Best practice for GitHub)
Create .env.example (safe for GitHub):

SPRING_APPLICATION_NAME=springboot-rabbitmq
SPRING_RABBITMQ_HOST=localhost
SPRING_RABBITMQ_PORT=5672
SPRING_RABBITMQ_USERNAME=guest
SPRING_RABBITMQ_PASSWORD=guest
Then:

git add .env.example
git commit -m "Add env example file"
git push
✅ Final Checklist
✔ Remote URL fixed
✔ Code pushed successfully
✔ Secrets protected
✔ Recruiter-ready repo

After this, your GitHub repo will look professional and clean 👌

If you want next:

clean README.md

Docker Compose (Spring Boot + RabbitMQ)

or resume-ready explanation of this project

Just say 👍

You said:
PS C:\Users\User\Desktop\SPRING BOOT\springboot-rabbitmq> git remote remove origin
PS C:\Users\User\Desktop\SPRING BOOT\springboot-rabbitmq> git remote add origin https://github.com/Darshanshrinandi/RabbitMQ-Project.git
PS C:\Users\User\Desktop\SPRING BOOT\springboot-rabbitmq> git remote -v
origin  https://github.com/Darshanshrinandi/RabbitMQ-Project.git (fetch)
origin  https://github.com/Darshanshrinandi/RabbitMQ-Project.git (push)
PS C:\Users\User\Desktop\SPRING BOOT\springboot-rabbitmq> git push -u origin main
To https://github.com/Darshanshrinandi/RabbitMQ-Project.git
 ! [rejected]        main -> main (fetch first)
error: failed to push some refs to 'https://github.com/Darshanshrinandi/RabbitMQ-Project.git'
hint: Updates were rejected because the remote contains work that you do not
hint: have locally. This is usually caused by another repository pushing to
hint: the same ref. If you want to integrate the remote changes, use
hint: 'git pull' before pushing again.
hint: See the 'Note about fast-forwards' in 'git push --help' for details.
PS C:\Users\User\Desktop\SPRING BOOT\springboot-rabbitmq> 
ChatGPT said:
Perfect, you’re very close 👍
This error is very common and easy to fix.

❌ Why this error happened
! [rejected] main -> main (fetch first)
It means:

👉 Your GitHub repo already has something
Usually this is because:

You clicked “Add README” or

GitHub auto-created files (README / license)

Your local repo = empty history
Your remote repo = already has 1 commit

Git is protecting you from overwriting remote history.

✅ BEST & SAFE FIX (Recommended)
Step 1: Pull remote changes first
git pull origin main --allow-unrelated-histories
Why this works:

Your repo and GitHub repo started separately

This flag tells Git: “Yes, merge them”

If it opens an editor:

Just save and close (default merge message is fine)

Step 2: Push again 🚀
git push -u origin main
✅ This should succeed now.

🔥 ALTERNATIVE (Force push – NOT recommended for beginners)
Only use this if:

Repo is new

No one else is using it

You want to overwrite GitHub completely

git push -u origin main --force
⚠️ This deletes GitHub’s existing commits.

👉 Use only if you are 100% sure

🟢 What I recommend for YOU
Since you’re building this for projects & recruiters:

✔ Use git pull --allow-unrelated-histories
✔ Keep README + your code
✔ Clean history

✅ Final Expected Result
After success, you’ll see:

Branch 'main' set up to track remote branch 'main' from 'origin'.
And your GitHub repo will show:

Spring Boot code

RabbitMQ config

Controllers, Producers, Consumers

⚠️ One last IMPORTANT reminder
You already committed .env earlier.

After push succeeds, remove it from Git (if not done yet):

git rm --cached .env
git commit -m "Remove .env from version control"
git push
If you want, next I can:

review your GitHub repo like a recruiter

write a strong README

add Docker Compose (RabbitMQ + Spring Boot)

Just tell me what you want next 💪

You said:
Merge branch 'main' of https://github.com/Darshanshrinandi/RabbitMQ-Project
# Please enter a commit message to explain why this merge is necessary,                                                                             
# especially if it merges an updated upstream into a topic branch.                                                                                  
#
# Lines starting with '#' will be ignored, and an empty message aborts
# the commit.
~                                                                                                                                                   ~                                                                                                                                                   ~                                                                                                                                                   ~                                                                                                                                                   ~                                                                                                                                                   ~                                                                                                                                                   ~                                                                                                                                                   ~                                                                                                                                                   ~                                                                                                                                                   ~                                                                                                                                                   ~                                                                                                                                                   .git/MERGE_MSG [unix] (22:51 23/12/2025)                                                                                                     1,1 All
"~/Desktop/SPRING BOOT/springboot-rabbitmq/.git/MERGE_MSG" [unix] 6L, 302B   
ChatGPT said:
You’re inside the Git merge commit editor (Vim) 👍
Nothing is wrong — Git is just asking you to confirm the merge commit message.

✅ What you should do now (VERY SIMPLE)
👉 Just save and exit the editor
Press these keys in order:

ESC
:wq
ENTER
That’s it ✅

🔹 What this does
Accepts the default merge message

Completes the git pull --allow-unrelated-histories

Finishes the merge successfully

🔹 After you exit, you’ll be back in PowerShell
Now run:

git push -u origin main
🚀 Your project will be pushed to GitHub successfully.

🧠 If you ever see this again
Git uses Vim by default

ESC + :wq + Enter = save & quit

ESC + :q! + Enter = quit without saving

⚠️ One last reminder (important)
After push succeeds, remove .env from Git if you haven’t already:

git rm --cached .env
git commit -m "Remove .env from version control"
git push
You handled this like a pro 💪
If you want next:

README polishing

Docker Compose

Recruiter-style project review

Just say 👍

You said:
add readme file where it is a simple project 
package com.rabbitmq.springboot.dto;

import lombok.Data;

@Data
public class User {

    private int id;

    private String firstName;
    private String lastName;
}
package com.rabbitmq.springboot.controller;

import com.rabbitmq.springboot.dto.User;
import com.rabbitmq.springboot.publisher.RabbitMQJsonProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v2")
public class MessageJsonController {

    @Autowired
    private RabbitMQJsonProducer  rabbitMQJsonProducer;


    @PostMapping("/publish")
    public ResponseEntity<String> publishMessage(@RequestBody User user){

rabbitMQJsonProducer.sendMessage(user);
return ResponseEntity.ok("Json message sent to RabbitMQ... ");
    }
}
package com.rabbitmq.springboot.controller;

import com.rabbitmq.springboot.publisher.RabbitMQProducer;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class MessageController {

    @Autowired
   private RabbitMQProducer rabbitMQProducer;



    @GetMapping("/publish")
    public ResponseEntity<String> publishMessage(@RequestParam("message") String message){

        rabbitMQProducer.sendMessage(message);
        return ResponseEntity.ok("Message sent to RabbitMQ...");

    }
}



ChatGPT said:
Got it 👍
Here’s a simple, clean README.md suitable for this project (basic RabbitMQ + Spring Boot).
You can copy-paste this directly into README.md.

# Spring Boot RabbitMQ Example

This is a **simple Spring Boot project** demonstrating how to integrate **RabbitMQ** for sending messages using REST APIs.

The project covers:
- Sending **plain text messages**
- Sending **JSON messages (DTO object)**
- Basic Producer–Controller flow

---

## 🛠 Tech Stack
- Java
- Spring Boot
- RabbitMQ
- Spring AMQP
- Lombok

---

## 📂 Project Structure
com.rabbitmq.springboot
├── controller
│ ├── MessageController.java
│ └── MessageJsonController.java
├── publisher
│ ├── RabbitMQProducer.java
│ └── RabbitMQJsonProducer.java
├── dto
│ └── User.java
└── SpringbootRabbitmqApplication.java

---

## 🚀 APIs

### 1️⃣ Publish String Message
**Endpoint**

**Description**
- Sends a plain text message to RabbitMQ queue.

---

### 2️⃣ Publish JSON Message
**Endpoint**

**Request Body**
```json
{
  "id": 1,
  "firstName": "Darshan",
  "lastName": "SV"
}

---

### Now commit and push it
```bash
git add README.md
git commit -m "Add simple README"
git push

