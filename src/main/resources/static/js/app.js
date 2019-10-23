var  inicioModule = (function () {

    var dataToAiport ={
        airportId: null,
        code: null,
        name: null,
        lat: null,
        long: null,
        city:null
    };
    var updateTableAeropuertos = function (data) {
            $("#AeropuertosTable tbody").empty();
            data.map(function(val, index){
                console.log(val + " " + index);
                var toAdd = '<tr><td>'+val.city+'</td><td>'+val.lat+'</td><td>'+val.long+'</td></tr>';
                $("#AeropuertosTable tbody").append(toAdd);
            })
        }

    var demeAeropuertos = fuction(){
        var getPromise = $.get("/Aeropuertos");

        getPromise.then(
            function (data) {
                updateTableAeropuertos(JSON.parse(data));
            },
            function () {
                console.log('get failed');
            }
        );
        return getPromise;
    });

    return{
        darAeropuertos: function () {
            demeAeropuertos();
        }
    };

})();


