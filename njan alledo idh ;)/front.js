// script.js for front page button only
document.addEventListener("DOMContentLoaded", function() {
    const frontBtn = document.getElementById("frontBtn");

    if (frontBtn) {
        frontBtn.addEventListener("click", function() {
            window.location.href = "index.html"; // redirect to index.html
        });
    }
});
