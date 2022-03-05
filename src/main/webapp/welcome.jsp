<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

Welcome <s:property value = "fName" />  <s:property value = "lName" /> 
Address : 	<s:property value = "address" />  
<br><br>STRUT textbox	
<br>
	<s:textfield name="struttextbox" label="Userid" />
<br><br>HTML text box
<br>
	<input type="text" name="html text box"/>
	
	<br>
	<s:append var="appendIterator">
     	<s:param value="%{myList1}" /><s:param value="%{myList2}" /> 
	</s:append>
		
	<ul>
		<s:iterator value="%{#appendIterator}">  
		  <li>
			  <s:property />    
		  </li>
		</s:iterator>>
	</ul>
<br>
 <img src="1.png"/>