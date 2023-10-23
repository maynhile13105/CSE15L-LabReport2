# **LAB REPORT 2**

## ***Part 1***
- [**Code**](https://maynhile13105.github.io/CSE15L-LabReport2/StringServer.java)

![image](https://github.com/maynhile13105/CSE15L-LabReport2/assets/146885739/1f722b19-8907-439e-9bd2-56bc7c1f4395)

- Method `handleRequest()` received the URL as its argument,
- Method `getPath()` and method `getQuery()` did not receive any arguments
- Method `splits()` received "=" as its argument.
- Method `equals()` was used twice: Once, it received "/" as an argument. Once, it received "s" as an argument
- Method `contains()` received "/add-messages" as its argument.
- Other fields of the class are `num` and `result`.
- `num` was increased by 1, from 0 to 1, and then `result` was changed from "" to `1. Hello+bob 
There were those changes because the URL I passed qualified the specific requests that match the "/add-messages" and have "s" as the first query parameter. It means that a message had been found. So 'num' was changed to 1 and the message "1. Hello+bob" was added to the 'result'. 

- **Screenshot shows using `/add-messages?s=Hello bob`**
  
![image](https://github.com/maynhile13105/CSE15L-LabReport2/assets/146885739/190b5d9d-e53d-40e0-a6e8-477545fe8af5)

- Method `handleRequest()` received the URL as its argument,
- Method `getPath()` and method `getQuery()` did not receive any arguments
- Method `splits()` received "=" as its argument.
- Method `equals()` was used twice: Once, it received "/" as an argument. Once, it received "s" as an argument
- Method `contains()` received "/add-messages" as its argument.
- Other fields of the class are `num` and `result`.
-  `num` was increased by 1, from 1 to 2. and then `result` was changed from `1. Hello+bob` to `1. Hello+bob \n 2. HowYouLikeThat".  
There were those changes because the URL I passed qualified the specific requests that match the "/add-messages" and have "s" as the first query parameter. It means that a message had been found. So 'num' was increased to 2 and the message "2. HowYouLikeThat" was added to the 'result'. 
- **Screenshot for using `/add-messages?s=HowYouLikeThat`**
![image](https://github.com/maynhile13105/CSE15L-LabReport2/assets/146885739/b8a55ee4-e645-4f27-a9e3-ee02c1e35b3f)

## ***Part 2***
- The screenshot for using the command `ls` the path to the private key for my SSH key for logging into ieng6 on my computer

![image](https://github.com/maynhile13105/CSE15L-LabReport2/assets/146885739/fe8041b7-9d95-4e83-ac62-bc8c0ab7c71b)

- The screenshot for using the command `ls`  public key for your SSH key for logging into ieng6 within my account on ieng6
![image](https://github.com/maynhile13105/CSE15L-LabReport2/assets/146885739/7ff80cb9-f128-4a07-a818-b30b4fcea311)

The screenshot shows that I logged into ieng6 with my course-specific account without being asked for a password.
![image](https://github.com/maynhile13105/CSE15L-LabReport2/assets/146885739/abffeaa3-47d7-4691-8b66-db7e266033fd)

## ***Part 3***
- The first thing I learned in the past two weeks is how to compile and run Java programs via command. Previously, to run a certain program, I had to use that language's IDE, which took up most of my computer's memory. After knowing how to use commands, I can operate directly on my computer or need software like Visual Studio Code to run the program. This makes my computer work faster.
- The second thing I really like is the server. Before, I had only heard of 'server' but had no idea what it was. The past 2 weeks also taught me how to create and run a server. I can also log in to another server remotely. I can also clearly understand the URL through operations when running a server.
