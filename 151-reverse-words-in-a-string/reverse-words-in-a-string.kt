class Solution {
    fun reverseWords(s: String): String {
        val words = s.trim().split(" ")
        var result = ""
        for(i in words.size - 1 downTo 0) {
            if(words[i] != "") {
                if(result != "" ){
                    result = result + " ";
                }
                result = result + words[i];
            }
        }

        return result;
    }
}