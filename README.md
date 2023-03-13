# Set the file path and file name
$filePath = "C:\Users\JohnDoe\Documents\"
$fileName = "example.txt"

# Check if the file exists in the specified file path
if (Test-Path "$filePath$fileName") {
    # Check if the file size is less than 100KB
    if ((Get-Item "$filePath$fileName").Length -lt 100000) {
        # Set the email parameters for file less than 100KB
        $emailTo = "example1@email.com", "example2@email.com"
        $emailFrom = "powershell@example.com"
        $emailSubject = "File Found (Less than 100KB)"
        $emailBody = "The file $fileName was found in the file path $filePath and its size is less than 100KB."

        # Set the email SMTP server details
        $smtpServer = "smtp.example.com"
        $smtpPort = 587
        $smtpCredential = New-Object System.Net.NetworkCredential("username", "password")

        # Send the email
        Send-MailMessage -To $emailTo -From $emailFrom -Subject $emailSubject -Body $emailBody -SmtpServer $smtpServer -Port $smtpPort -Credential $smtpCredential
    }
    else {
        # Set the email parameters for file found
        $emailTo = "example3@email.com"
        $emailFrom = "powershell@example.com"
        $emailSubject = "File Found"
        $emailBody = "The file $fileName was found in the file path $filePath."

        # Set the email SMTP server details
        $smtpServer = "smtp.example.com"
        $smtpPort = 587
        $smtpCredential = New-Object System.Net.NetworkCredential("username", "password")

        # Send the email
        Send-MailMessage -To $emailTo -From $emailFrom -Subject $emailSubject -Body $emailBody -SmtpServer $smtpServer -Port $smtpPort -Credential $smtpCredential
    }
}
else {
    # Set the email parameters for file not found
    $emailTo = "example4@email.com"
    $emailFrom = "powershell@example.com"
    $emailSubject = "File Not Found"
    $emailBody = "The file $fileName was not found in the file path $filePath."

    # Set the email SMTP server details
    $smtpServer = "smtp.example.com"
    $smtpPort = 587
    $smtpCredential = New-Object System.Net.NetworkCredential("username", "password")

    # Send the email
    Send-MailMessage -To $emailTo -From $emailFrom -Subject $emailSubject -Body $emailBody -SmtpServer $smtpServer -Port $smtpPort -Credential $smtpCredential
}
