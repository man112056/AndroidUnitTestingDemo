package com.manish.example.compose.androidunittestingdemo.helper

class DemoUtils {

    fun isStringValid(inputStr: String): Boolean {
        return inputStr.isNotEmpty()
    }

    fun isPalindrome(input: String): Boolean {
        // Initialize a StringBuilder to collect alphanumeric characters
        val sanitizedInput = StringBuilder()

        // Iterate over each character in the input string
        for (char in input) {
            // Check if the character is a letter or digit
            if (char.isLetterOrDigit()) {
                // Append the lowercase version of the character to the StringBuilder
                sanitizedInput.append(char.lowercaseChar())
            }
        }

        // Convert the StringBuilder to a string
        val sanitizedStr = sanitizedInput.toString()
        // Get the reversed version of the sanitized string
        val reversedStr = sanitizedInput.reverse().toString()

        // Compare the sanitized string with its reversed version
        return sanitizedStr == reversedStr
    }
}