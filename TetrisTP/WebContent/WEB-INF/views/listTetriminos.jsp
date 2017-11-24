<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<div class="row col s2">
	<table>
		<thead>
         		<tr>
           			<th>Id</th>
            		<th>Nom</th>
             		<th>Couleur</th>
             		<th>Actions</th>
         		</tr>
        	</thead>
        	<tbody>
			<c:forEach items="${tetris}" var="forme">
				<tr>
					<td>${forme.id}</td>
					<td>${forme.name}</td>
					<td>${forme.color}</td>
					<td>
						<a class="waves-effect waves-teal btn-flat" href="${pageContext.request.contextPath}/edition?id=${forme.id}">Modifier</a>
						<a class="waves-effect waves-teal btn-flat" href="list" name="delete" value="${forme.id}">Retirer</a>
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</div>