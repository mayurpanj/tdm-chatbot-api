This is a Spring boot application.

Steps to run the application
1. checkout the project

2. Maven update

3. Run TdmChatbotApiApplication.java

4. The application is working on port 8090 (check application.properties)

5. Example to get the chat query result:

http://localhost:8090/chatresponse/how to get production data

*************************************************

Note: "How to get production data" is the path variable. i.e. The query sent by the user

A. The queries and the results are to be provided in 
https://bitbucket.org/kapil_mistry_1/tdm-chatbot-api/src/master/src/main/resources/bots/super/aimlif/a-custom-entry-aiml-csv

B. Once the sheet is updated. restart the server by running TdmChatbotApiApplication.java file again

*************************************************

Sample request and output:
http://localhost:8090/chatresponse/how can i get PRE PRODUCTION DATA

output: {"response":"No"}