document.addEventListener("DOMContentLoaded", function () {
    let prevScrollPos = window.pageYOffset;

    window.addEventListener("scroll", function () {
        let currentScrollPos = window.pageYOffset;
        let navbar = document.getElementById("navbar");

        if (prevScrollPos > currentScrollPos) {
            navbar.style.top = "0"; // Muestra la navbar
        } else {
            navbar.style.top = "-80px"; // Oculta la navbar (ajusta la altura si es necesario)
        }
        prevScrollPos = currentScrollPos;
    });
});
