// Online Javascript Editor for free
// Write, Edit and Run your Javascript code using JS Online Compiler

function reverse_words(sentence) {
    const temp_array = [];
    let word = '';
    
    for (let i = 0; i < sentence.length; i++) {
      const char = sentence[i];
      
      if (char ===' ' || i === sentence.length - 1) {
          if(i===sentence.length-1){
              word+=char;
          }
      let reversedWord = '';
      for (let j = word.length - 1; j >=0; j--) {
      reversedWord += word[j];
      
  }
  temp_array.push(reversedWord);
    word = '';
      } else {
        word += char;
      }
    }
  
    let reversed_sentence = '';
    for (let i = 0; i < temp_array.length; i++) {
      reversed_sentence += temp_array[i];
      if (i < temp_array.length - 1) {
        reversed_sentence += ' ';
      }
    }
  
    return reversed_sentence;
  }
  
  const sentence = prompt();
  console.log(reverse_words(sentence)); 