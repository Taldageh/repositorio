$(document).ready(function () {

    console.log("jQuery:", typeof $);

    console.log("Kendo:", typeof kendo);
    
    let data = [
        {ID: 1, ProductName: "feminino" },
        {ID: 2, ProductName: "masculino" }
    ];
    
    // Target the select element by using jQuery and then call the kendoDropDownList() method.
    $("#dropdownlist").kendoDropDownList({
        dataTextField:"ProductName",
        dataValueField:"ID",
        height: "400px",
        dataSource: data
        // filter:"contains"
    });
});
 

