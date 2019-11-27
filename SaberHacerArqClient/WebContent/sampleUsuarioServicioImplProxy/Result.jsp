<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleUsuarioServicioImplProxyid" scope="session" class="co.edu.uan.servicio.UsuarioServicioImplProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleUsuarioServicioImplProxyid.setEndpoint(request.getParameter("endpoint"));
%>

<%
String method = request.getParameter("method");
int methodID = 0;
if (method == null) methodID = -1;

if(methodID != -1) methodID = Integer.parseInt(method);
boolean gotMethod = false;

try {
switch (methodID){ 
case 2:
        gotMethod = true;
        java.lang.String getEndpoint2mtemp = sampleUsuarioServicioImplProxyid.getEndpoint();
if(getEndpoint2mtemp == null){
%>
<%=getEndpoint2mtemp %>
<%
}else{
        String tempResultreturnp3 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getEndpoint2mtemp));
        %>
        <%= tempResultreturnp3 %>
        <%
}
break;
case 5:
        gotMethod = true;
        String endpoint_0id=  request.getParameter("endpoint8");
            java.lang.String endpoint_0idTemp = null;
        if(!endpoint_0id.equals("")){
         endpoint_0idTemp  = endpoint_0id;
        }
        sampleUsuarioServicioImplProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        co.edu.uan.servicio.UsuarioServicioImpl getUsuarioServicioImpl10mtemp = sampleUsuarioServicioImplProxyid.getUsuarioServicioImpl();
if(getUsuarioServicioImpl10mtemp == null){
%>
<%=getUsuarioServicioImpl10mtemp %>
<%
}else{
        if(getUsuarioServicioImpl10mtemp!= null){
        String tempreturnp11 = getUsuarioServicioImpl10mtemp.toString();
        %>
        <%=tempreturnp11%>
        <%
        }}
break;
case 13:
        gotMethod = true;
        String telefono_2id=  request.getParameter("telefono18");
        int telefono_2idTemp  = Integer.parseInt(telefono_2id);
        String sexo_3id=  request.getParameter("sexo20");
            java.lang.String sexo_3idTemp = null;
        if(!sexo_3id.equals("")){
         sexo_3idTemp  = sexo_3id;
        }
        String apellido_4id=  request.getParameter("apellido22");
            java.lang.String apellido_4idTemp = null;
        if(!apellido_4id.equals("")){
         apellido_4idTemp  = apellido_4id;
        }
        String nombre_5id=  request.getParameter("nombre24");
            java.lang.String nombre_5idTemp = null;
        if(!nombre_5id.equals("")){
         nombre_5idTemp  = nombre_5id;
        }
        String id_6id=  request.getParameter("id26");
            java.lang.Long id_6idTemp = null;
        if(!id_6id.equals("")){
         id_6idTemp  = java.lang.Long.valueOf(id_6id);
        }
        String estadocivil_7id=  request.getParameter("estadocivil28");
            java.lang.String estadocivil_7idTemp = null;
        if(!estadocivil_7id.equals("")){
         estadocivil_7idTemp  = estadocivil_7id;
        }
        %>
        <jsp:useBean id="co1edu1uan1usuarios1modelo1Usuario_1id" scope="session" class="co.edu.uan.usuarios.modelo.Usuario" />
        <%
        co1edu1uan1usuarios1modelo1Usuario_1id.setTelefono(telefono_2idTemp);
        co1edu1uan1usuarios1modelo1Usuario_1id.setSexo(sexo_3idTemp);
        co1edu1uan1usuarios1modelo1Usuario_1id.setApellido(apellido_4idTemp);
        co1edu1uan1usuarios1modelo1Usuario_1id.setNombre(nombre_5idTemp);
        co1edu1uan1usuarios1modelo1Usuario_1id.setId(id_6idTemp);
        co1edu1uan1usuarios1modelo1Usuario_1id.setEstadocivil(estadocivil_7idTemp);
        boolean agregarUsuario13mtemp = sampleUsuarioServicioImplProxyid.agregarUsuario(co1edu1uan1usuarios1modelo1Usuario_1id);
        String tempResultreturnp14 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(agregarUsuario13mtemp));
        %>
        <%= tempResultreturnp14 %>
        <%
break;
case 30:
        gotMethod = true;
        String id_8id=  request.getParameter("id33");
        long id_8idTemp  = Long.parseLong(id_8id);
        boolean borrarUsuario30mtemp = sampleUsuarioServicioImplProxyid.borrarUsuario(id_8idTemp);
        String tempResultreturnp31 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(borrarUsuario30mtemp));
        %>
        <%= tempResultreturnp31 %>
        <%
break;
case 35:
        gotMethod = true;
        String id_9id=  request.getParameter("id50");
        long id_9idTemp  = Long.parseLong(id_9id);
        co.edu.uan.usuarios.modelo.Usuario obtenerUsuario35mtemp = sampleUsuarioServicioImplProxyid.obtenerUsuario(id_9idTemp);
if(obtenerUsuario35mtemp == null){
%>
<%=obtenerUsuario35mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">telefono:</TD>
<TD>
<%
if(obtenerUsuario35mtemp != null){
%>
<%=obtenerUsuario35mtemp.getTelefono()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">sexo:</TD>
<TD>
<%
if(obtenerUsuario35mtemp != null){
java.lang.String typesexo40 = obtenerUsuario35mtemp.getSexo();
        String tempResultsexo40 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typesexo40));
        %>
        <%= tempResultsexo40 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">apellido:</TD>
<TD>
<%
if(obtenerUsuario35mtemp != null){
java.lang.String typeapellido42 = obtenerUsuario35mtemp.getApellido();
        String tempResultapellido42 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeapellido42));
        %>
        <%= tempResultapellido42 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">nombre:</TD>
<TD>
<%
if(obtenerUsuario35mtemp != null){
java.lang.String typenombre44 = obtenerUsuario35mtemp.getNombre();
        String tempResultnombre44 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typenombre44));
        %>
        <%= tempResultnombre44 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">id:</TD>
<TD>
<%
if(obtenerUsuario35mtemp != null){
java.lang.Long typeid46 = obtenerUsuario35mtemp.getId();
        String tempResultid46 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeid46));
        %>
        <%= tempResultid46 %>
        <%
}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">estadocivil:</TD>
<TD>
<%
if(obtenerUsuario35mtemp != null){
java.lang.String typeestadocivil48 = obtenerUsuario35mtemp.getEstadocivil();
        String tempResultestadocivil48 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeestadocivil48));
        %>
        <%= tempResultestadocivil48 %>
        <%
}%>
</TD>
</TABLE>
<%
}
break;
}
} catch (Exception e) { 
%>
Exception: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.toString()) %>
Message: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.getMessage()) %>
<%
return;
}
if(!gotMethod){
%>
result: N/A
<%
}
%>
</BODY>
</HTML>