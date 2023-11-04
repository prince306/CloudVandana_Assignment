var arr=[];
var size=prompt();
for(let i=0;i<size;i++){
    arr[i]=prompt();
    // console.log(arr[i]+"  ");
}
for(let i=0;i<size;i++){
    for(let j=0;j<size-i-1;j++){
        if(arr[j]>arr[j+1]){
            let temp=arr[j];
            arr[j]=arr[j+1];
            arr[j+1]=temp;
        }
    }
}
for(let i=arr.length-1;i>=0;i--){
    
    console.log(arr[i]);
}