<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

Welcome <s:property value = "greetingName" />   
<br><br>STRUT textbox	

	<s:textfield name="struttextbox" label="Userid" />

	<label>Userid:</Label>
	<input type="text" name="html text box"/>
	
	<br>
	<s:append var="appendIterator">
     	<s:param value="%{fruits}" /><s:param value="%{vegetables}" /> 
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