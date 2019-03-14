<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
${msg}

${name}

<#if sex==1>
    男
    <#elseif sex==0>
    女
    <#else>
    其他
</#if>

<#list list as user>
    ${user}
</#list>
</body>
</html>