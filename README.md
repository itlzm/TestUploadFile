# TestUploadFile
SpringMVC文件上传配置，使用MultipartFile类

    1.浏览器访问home主页地址：localhost:8080/TestUploadFile/index.html
    2.上传单个文件访问地址:localhost:8080/TestUploadFile/fileUpload.html
    3.上传多个文件访问地址:localhost:8080/TestUploadFile/filesUpload.html
    4.文件上传成功后，保存在tomcat\wtpwebapps\TestUploadFile\upload目录下,
    可以在FileUploadController类中,具体方法更改保存路径
    注意：若上传文件时失败，出现NullpointException，
    查看在src/main/webapp目录下是否存在upload目录，若没有，则手动新建。
