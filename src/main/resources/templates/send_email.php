<?php
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $name = $_POST["name"];
    $email = $_POST["email"];
    $message = $_POST["message"];

    // Set up email parameters
    $to = "eng.bll.raslen@gmail.com";
    $subject = "New message from contact form";
    $headers = "From: $email\r\n" .
               "Reply-To: $email\r\n" .
               "X-Mailer: PHP/" . phpversion();

    // Send email
    mail($to, $subject, $message, $headers);

    // Redirect to thank you page
    header("Location: thank_you.html");
    exit;
}
?>
