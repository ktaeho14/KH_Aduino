<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<style type="text/css">
<style type="text/css">
    h1{
        text-align: center;
    }
    
    h2{
        text-align:center;
        background-color: gray;
       
        padding: 50px;
    }
   #nav{
       list-style: none;
       height:40px;
       padding:10px 1px;
       margin:0;
       background-color: black;
       padding-left: 25%;
   }
   #nav li{
       float: left;
       position: relative;
       margin: 5px 30px;
       padding: 5px;
   }
   #nav li a{
       display: block;
       font-weight:bold;
       font-size: 18px;
       padding: 7px 8px;
       margin: 0;
       color: white;
       margin: 0;
       text-decoration: none;
       
   }

   #nav li:hover > a{
       background: blue;
       color: white;
       margin: 0;
       padding: 5px;
   }

   #nav ul{
       list-style: none;
       margin : 0 auto;
       padding: 0;
       position: absolute;
       left: 0;
       top: 45px;
       width: 105px;
       background:black;
       text-align: center;
       opacity: 0;
   }
   #nav ul li{
       float:none;
       margin:0;
       padding: 0;
       font-size: 10px;
   }

   #nav ul a{
       font-weight: bold;
       color:white;
       
   }

   #nav ul li:hover a{
       background:#cc9882;
       font-weight: bold;
   }
   #nav li:hover ul{
       opacity:1;
   }
   #nav li:hover ul li{
       height:35px;
       overflow:visible;
       padding:0;
   }

   table{
       width: 100%;
   }

   header{
       background-color: lightsteelblue;
       padding: 70px;
   }
   footer{
       background-color: lightsteelblue;
       padding: 10px;
   }
  
  .but{
      cursor: pointer;
      font: bold;
      font-size: 25px;
     
  }
  div{
      text-align: center;
  }

   

</style>
</head>
<body>

   <header> <h1> ���� ���� ���/��ȣ</h1></header>

    <article>
    <ul id="nav">
        <li><a href="#">���/��ȣ</a>
            <ul>
                <li><a href="controller.do?command='menu1'">���/��ȣ</a></li>
                <li><a href="#">��ȣ��</a></li>
            </ul>
        </li>
        <li><a href="#">�����Ű�</a>
            <ul>
                <li><a href="#">����</a></li>
            </ul>
        </li>
        <li><a href="#">�Ծ�Խ���</a>
            <ul>
                <li><a href="#">�Ծ缭��</a></li>
                <li><a href="#">�Ծ�����</a></li>
            </ul>
        </li>
        <li><a href="#">����Ȱ��</a>
            <ul>
                <li><a href="#">Ȱ�� �ı�</a></li>
            </ul>
        </li>
        <li><a href="#">�Խ���</a>
            <ul>
                <li><a href="#">���ǻ���</a></li>
                <li><a href="#">�Ű�����</a></li>
            </ul>
        </li>
 </ul>
</article>


<article class="article2">
    <h2>��� ��ȣ �Խ���</h2>
    <span>??�� ȯ���մϴ�</span>
</article>
<article class="article3">
    <table border="1">
        <tr>
            <th>�� ��ȣ</th>
            <th>�� �ۼ� �ð�</th>
            <th>�� ����</th>    
            <th>���� ����</th>
            <th>��ȣ ����</th>
        </tr>    
       

        <tr>
            <td colspan="5"><input type="button" value="�� ����"></td>
        </tr>

    </table>
    <div>
        <span class="but" onclick="">��</span>
        <span class="but" onclick="">1</span>
        <span class="but" onclick="">2</span>
        <span class="but" onclick="">3</span>
        <span class="but" onclick="">4</span>
        <span class="but" onclick="">��</span>
    </div>
</article>  
<footer>
    <span>footer</span>
</footer>    
</body>
</html>