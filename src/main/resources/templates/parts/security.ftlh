<#assign
known = Session.SPRING_SECURITY_CONTEXT??
>

<#if known>
    <#assign
    user = Session.SPRING_SECURITY_CONTEXT.authentication.principal
    currentUserId = user.getRecordId()
    fullName = user.getFullName()
    isAdmin = user.isAdmin()
    >
<#else>
    <#assign
    isAdmin = false
    currentUserId = -1
    fullName = "Unknown User"
    >
</#if>
