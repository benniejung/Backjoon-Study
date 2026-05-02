function solution(my_string, overwrite_string, s) {
    var answer = '';
    const length = s + overwrite_string.length;
    var word = my_string.substring(0, s);
    var word2 = my_string.substring(length);
    answer = word + overwrite_string + word2;
    console.log(answer);
    return answer;
}