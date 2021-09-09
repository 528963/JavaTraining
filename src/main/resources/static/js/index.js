const headEl = document.querySelector("header");

window.addEventListener("scroll",()=>{
    let height = headEl.getBoundingClientRect().height;
    if(window.pageYOffset - height > 200){
        if(!headEl.classList.contains("sticky")){
            headEl.classList.add("sticky");
        }else{
            headEl.classList.remove("sticky");
        }
    }
})