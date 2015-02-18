    function getAbsolutePath() {
        var loc = window.location;
        var pathName = loc.pathname.substring(0, loc.pathname.lastIndexOf('/') + 1);
        return loc.href.replace('#', '').substring(0, loc.href.replace('#', '').length - ((loc.pathname + loc.search + loc.hash).length - pathName.length));
    }
    
    function send(url, data, method) {
        $.ajax({
    	    async : false,
    	    type: method,
    	    contentType: 'application/json',
    	    url: getAbsolutePath() + url,
    	    data: JSON.stringify($(data).serializeJSON()),
    	    dataType: 'json',
    	    success: function(data) {
    	    	$('#idError').hide();
    	    	$('#idSuccess').show();
    	    },
    	    error: function(data) {
    	    	$('#idError').show();
    	    	$('#idSuccess').hide();
    	    }
    	});
    }
    
    function sendDelete(url) {
        $.ajax({
    	    async : false,
    	    type: 'POST',
    	    url: getAbsolutePath() + url,
    	    success: function(data) {
    	    	$('#removeError').hide();
    	    	$('#removeSuccess').show();
    	    },
    	    error: function(data) {
    	    	$('#removeError').show();
    	    	$('#removeSuccess').hide();
    	    }
    	});
    }