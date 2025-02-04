# Spring-REST-api

---

## Docker imp* Commands

1. To Build Docker File :
    `docker build -t app.jar .` 
2. To run Docker container/file : `docker run -t -p 9998:9998 --name testing-container app.jar`
3. docker process checking cmd : `docker ps`
4. To stop testing container : `docker stop testing-container` or to stop particular container : `docker stop <container-id>
   `
5. To remove testing container : `docker rm testing-container` or to remove particular container : `docker rm <container-id>
   `

## **Note**

- In docker build command change your app name.
- In Docker run command change your port number and app name.

