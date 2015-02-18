// The root URL for the RESTful services
var rootURL = "http://localhost:8080/ws_fastline/api/cond_pagamento";

var currentCondPagamento;

// Retrieve wine list when application starts 
findAll();

// Nothing to delete in initial application state
$('#btnDelete').hide();

// Register listeners
$('#btnSearch').click(function() {
	search($('#searchKey').val());
	return false;
});

// Trigger search when pressing 'Return' on search key input field
$('#searchKey').keypress(function(e){
	if(e.which == 13) {
		search($('#searchKey').val());
		e.preventDefault();
		return false;
    }
});

$('#btnAdd').click(function() {
	newCondPagamento();
	return false;
});

$('#btnSave').click(function() {
	
	if ($('#cond_pagId').val() == '')
		addCondPagamento();
	else
		updateCondPagamento();
	return false;
});

$('#btnDelete').click(function() {
	deleteCondPagamento();
	return false;
});

$('#cond_pagList a').live('click', function() {
	findById($(this).data('identity'));
});

// Replace broken images with generic wine bottle
//$("img").error(function(){
//  $(this).attr("src", "pics/generic.jpg");

//});

function search(searchKey) {
	if (searchKey == '') 
		findAll();
	else
		findByName(searchKey);
}

function newCondPagamento() {
	$('#btnDelete').hide();
	currentCondPagamento = {};
	renderDetails(currentCondPagamento); // Display empty form
}

function findAll() {
	console.log('findAll');
	
	$.ajax({
		type: 'GET',
		url: rootURL +'/1',
		dataType: "json", // data type of response
		success: renderList
	});
	
	
	
}

function findByName(searchKey) {
	console.log('findByName: ' + searchKey);
	$.ajax({
		type: 'GET',
		url: rootURL + '/search/' + searchKey,
		dataType: "json",
		success: renderList 
	});
}

function findById(id_cond_pagamento) {
	console.log('findById: ' + id_cond_pagamento);
	$.ajax({
		type: 'GET',
		url: rootURL + '/' + id_cond_pagamento,
		dataType: "json",
		success: function(data){
			$('#btnDelete').show();
			console.log('findById success: ' + data.nome_condicao);
			currentCondPagamento = data;
			renderDetails(currentCondPagamento);
		}
	});
}

function addCondPagamento() {
	console.log('addCondPagamento');
	$.ajax({
		type: 'POST',
		contentType: 'application/json',
		url: rootURL + '/add',
		dataType: "json",
		data: formToJSON(),
		success: function(data, textStatus, jqXHR){
			alert('Condicao Pagamento created successfully');
			$('#btnDelete').show();
			$('#cond_pagId').val(data.id_cond_pagamento);
		},
		error: function(jqXHR, textStatus, errorThrown){
			alert('addCondPagamento error: ' + textStatus);
		}
	});
}

function updateCondPagamento() {
	console.log('updateCondPagamento');
	$.ajax({
		type: 'PUT',
		contentType: 'application/json',
		url: rootURL + '/' + $('#cond_pagId').val(),
		dataType: "json",
		data: formToJSON(),
		success: function(data, textStatus, jqXHR){
			alert('Condicao Pagamento updated successfully');
		},
		error: function(jqXHR, textStatus, errorThrown){
			alert('updateCondPagamento error: ' + textStatus);
		}
	});
}

function deleteCondPagamento() {
	console.log('deleteCondPagamento');
	$.ajax({
		type: 'DELETE',
		url: rootURL + '/' + $('#cond_pagId').val(),
		success: function(data, textStatus, jqXHR){
			alert('Condicao Pagamento deleted successfully');
		},
		error: function(jqXHR, textStatus, errorThrown){
			alert('deletecond_pagId error');
		}
	});
}

function renderList(data) {
	alert('entoru');
	// JAX-RS serializes an empty list as null, and a 'collection of one' as an object (not an 'array of one')
	var list = data == null ? [] : (data instanceof Array ? data : [data]);

	$('#cond_pagList li').remove();
	$.each(list, function(index, condPagamento) {
		$('#cond_pagList').append('<li><a href="#" data-identity="' + condPagamento.id_cond_pagamento + '">'+condPagamento.nome_condicao+'</a></li>');
	});
}

function renderDetails(condPagamento) {
	$('#cond_pagId').val(condPagamento.id_cond_pagamento);
	$('#nome_condicao').val(condPagamento.nome_condicao);
	$('#forma_pag').val(condPagamento.forma_pag);
	$('#qtd_titulos').val(condPagamento.qtd_titulos);
	$('#condicao_qtd_dias').val(condPagamento.condicao_qtd_dias);
	$('#dt_cadastro').val(condPagamento.dt_cadastro);
	$('#dt_inativacao').val(condPagamento.dt_inativacao);
	$('#status').val(condPagamento.status);
}

// Helper function to serialize all the form fields into a JSON string
function formToJSON() {
	var condPagamentoId = $('#cond_pagId').val();
	return JSON.stringify({
		"id_cond_pagamento": condPagamentoId == "" ? null : condPagamentoId, 
		"nome_condicao": $('#nome_condicao').val(), 
		"forma_pag": $('#forma_pag').val(),
		"qtd_titulos": $('#qtd_titulos').val(),
		"condicao_qtd_dias": $('#condicao_qtd_dias').val(),
		"dt_cadastro": $('#dt_cadastro').val(),
		"dt_inativacao": $('#dt_inativacao').val(),
		"status": $('#status').val()
		});
}
