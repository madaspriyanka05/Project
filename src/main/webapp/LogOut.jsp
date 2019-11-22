<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html;charset=UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta http-equiv="Cache-Control" content="no-cache, no-store, must-revalidate" />
    <meta http-equiv="Pragma" content="no-cache" />
    <meta http-equiv="Expires" content="0" />
    <script src="<your_FLP_URL>/resources/sap/ui/thirdparty/jquery/jquery-1.11.1.js"></script>
</head>
<body>
    <em id="message">Logout is in progress...</em>
    <script>
    (function () {
        "use strict";
        /*global document, jQuery*/
        var iPending = 0;

        function finishLogout() {
            iPending -= 1;
            if (iPending <= 0) { //logout done for all URLs
                //Change message text on logout page
                document.getElementById("message").innerHTML = "You are logged out";
                //(3) Client-side redirect
                // Redirect back to the Fiori Launchpad login page
                document.location = "<your_FLP_URL>";
            }
        }

        function requestLogout(sUrl) {
            iPending += 1;
            jQuery.post(sUrl).always(finishLogout);
        }

        // FS-QUO logout URL (accessible only via Web Dispatcher unless using
		// full URL to the Java back-end server)
        requestLogout("/csiroot/logout");

    }());
    </script>
</body>
</html>