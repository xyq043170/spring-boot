<pre code_snippet_id="2483305" snippet_file_name="blog_20170714_7_5405711" name="code" class="java"><%@ page language="java" contentType="text/html; charset=UTF-8"  
    pageEncoding="UTF-8"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">  
<html>  
<head>  
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">  
    <title>Spring Boot Demo - JSP</title>  
</head>  
  
  
<body>  
    <center>  
        <h1 id="title">${title}</h1>  
    </center>  
      
    <script type="text/javascript" src="/webjars/jquery/2.1.4/jquery.min.js"></script>  
      
    <script>  
        $(function(){  
            $('#title').click(function(){  
                alert($(this).text());  
            });  
        })  
    </script>  
</body>  
</html></pre>  
<pre></pre>  