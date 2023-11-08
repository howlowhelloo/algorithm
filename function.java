function checkRealNumber() {
    var realNumber = parseFloat(
      document.getElementById("realNumberInput").value
    );
    if (realNumber > 0) {
      alert("Положительное число");
    } else if (realNumber < 0) {
      alert("Отрицательное число");
    } else {
      alert("Ноль");
    }
  }
