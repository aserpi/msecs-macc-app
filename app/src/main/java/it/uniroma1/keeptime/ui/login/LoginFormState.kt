package it.uniroma1.keeptime.ui.login

/**
 * Data validation state of the login form.
 */
data class LoginFormState(
    val usernameError: Int? = null,
    val passwordError: Int? = null,
    val serverError: Int? = null,
    val isDataValid: Boolean = false,
    val isGoogleSignInPossible: Boolean = false
)
