document.addEventListener("DOMContentLoaded", function () {
    const contactForm = document.getElementById("contactForm");
    const successMessage = document.getElementById("successMessage");

    if (contactForm && successMessage) {
        contactForm.addEventListener("submit", function (event) {
            event.preventDefault(); 
            successMessage.classList.remove("d-none"); 
            //Resetear el formulario
            contactForm.reset(); 
            
            setTimeout(() => {
                successMessage.classList.add("d-none"); 
            }, 5000);
        });
    } else {
        console.error("Error: No se encontró el formulario o el mensaje de éxito.");
    }
});
