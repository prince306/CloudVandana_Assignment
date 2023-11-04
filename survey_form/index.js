
    function resetForm() {
      document.getElementById('survey-form').reset();
    }

    document.getElementById('survey-form').addEventListener('submit', function (e) {
      e.preventDefault();
      const formData = new FormData(this);

      let popupText = "Survey Form Data:\n";
      for (const [key, value] of formData.entries()) {
        popupText += `${key}: ${value}\n`;
      }

      alert(popupText);
      resetForm();
    });
