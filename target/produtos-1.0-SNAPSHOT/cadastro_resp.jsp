<%@page import="modelo.Produto"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    Produto pp = new Produto();
    pp = (Produto) request.getAttribute("atrib_prod");
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
<body>
        <h1>CADASTRO - RESPOSTA</h1>
        <pre>
            Código:    <%=pp.getCodigo()%>
            Descrição:   <%=pp.getDescricao()%>
            Quantidade: <%=pp.getQuantidade()%>
            Valor Unitario: <%=pp.getValorUnitario()%>
            Data de ultima compra: <%=pp.getDataUltimaCompra()%>
            Valor Total: <%=pp.getValorTotal()%>
            Valor Unitario de vendas: <%=pp.getValorVendasUnitario()%>
            Valor total de vendas <%=pp.getValorVendasTotal()%>
            Descrição: <%=pp.getDescricao()%>
        </pre>
    </body>
</html>