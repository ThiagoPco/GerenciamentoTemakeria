/**
Demo script to handle the theme demo
 **/
function blockUI() {
		
        Metronic.blockUI();

        window.setTimeout(function() {
            Metronic.unblockUI();
        }, 2000);
}