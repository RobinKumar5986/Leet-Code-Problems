class Solution {
    fun reverseWords(s: String): String {
        var result = ""
        var word = ""
        for(i in 0 until s.length) {
            val c = s[i]
            if( c != ' '){
                word = word + c
            }else{
                if(word != "") {
                    if(result == "") {
                        result = word;
                    }else{
                        result = word + " " + result
                    }
                }
                word = ""
            }
        }
        if(word != ""){
            if(result == ""){
                result = word
            }else{
                result = word +  " " + result
            }
        }
        return result
    }
}