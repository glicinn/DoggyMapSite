let center = [55.75428442337138,37.62071970898438]
function init(){
    let map = new ymaps.Map('map-test', {
        center: center,
        zoom: 12
    });

    let placemark = new ymaps.Placemark([55.752683, 37.637656], {
        balloonContent: `
            <div class="balloon">
                <img class="balloon_image" src="/css/images/placesfoto/kitaigorod-1.jpg">
                <div class="balloon_text_block">
                  <div class="balloon_name"><h4><b>Kitai Gorod</b></h4></div>
                  <div class="balloon_address"><h6>Moscow</h6></div>
                  <hr>
                  <div class="balloon_text">Dog walking areas are completely fenced areas
                   where dogs can spend time off-leash. The grounds come complete with special
                    dog training structures that have proven themselves in popular dog
                     competitions called agility.</div>
                  <div class="balloon_link"><a href="https://www.google.com/">Read more</a></div>
                </div>
            </div>
            `

    }, {
        iconLayout: 'default#image',
        iconImageHref: '/css/images/placelogo.png',
        iconImageSize: [25, 25],
        iconImageOffset: [-10, -10] // Отступ от центра
    });


    let placemark2 = new ymaps.Placemark([55.797375, 37.679011], {
        balloonContent: `
            <div class="balloon">
                <img class="balloon_image" src="/css/images/placesfoto/sokolniki-1.jpg">
                <div class="balloon_text_block">
                  <div class="balloon_name"><h4><b>Sokolniki</b></h4></div>
                  <div class="balloon_address"><h6>Moscow</h6></div>
                  <hr>
                  <div class="balloon_text">Dog walking areas are completely fenced areas
                   where dogs can spend time off-leash. The grounds come complete with special
                    dog training structures that have proven themselves in popular dog
                     competitions called agility.</div>
                  <div class="balloon_link"><a href="https://www.google.com/">Read more</a></div>
                </div>
            </div>
            `
    }, {
        iconLayout: 'default#image',
        iconImageHref: '/css/images/placelogo.png',
        iconImageSize: [25, 25],
        iconImageOffset: [-10, -10] // Отступ от центра
    })

    let placemark3 = new ymaps.Placemark([55.770992, 37.579130], {
        balloonContent: `
            <div class="balloon">
                <img class="balloon_image" src="/css/images/placesfoto/belorus-1.jpg">
                <div class="balloon_text_block">
                  <div class="balloon_name"><h4><b>Belorusskaya</b></h4></div>
                  <div class="balloon_address"><h6>Moscow</h6></div>
                  <hr>
                  <div class="balloon_text">Dog walking areas are completely fenced areas
                   where dogs can spend time off-leash. The grounds come complete with special
                    dog training structures that have proven themselves in popular dog
                     competitions called agility.</div>
                  <div class="balloon_link"><a href="https://www.google.com/">Read more</a></div>
                </div>
            </div>
            `
    }, {
        iconLayout: 'default#image',
        iconImageHref: '/css/images/placelogo.png',
        iconImageSize: [25, 25],
        iconImageOffset: [-10, -10] // Отступ от центра
    })

    let placemark4 = new ymaps.Placemark([55.825417, 37.580617], {
        balloonContent: `
            <div class="balloon">
                <img class="balloon_image" src="/css/images/placesfoto/fonviz-1.jpg">
                <div class="balloon_text_block">
                  <div class="balloon_name"><h4><b>Fonvizinskaya</b></h4></div>
                  <div class="balloon_address"><h6>Moscow</h6></div>
                  <hr>
                  <div class="balloon_text">Dog walking areas are completely fenced areas
                   where dogs can spend time off-leash. The grounds come complete with special
                    dog training structures that have proven themselves in popular dog
                     competitions called agility.</div>
                  <div class="balloon_link"><a href="https://www.google.com/">Read more</a></div>
                </div>
            </div>
            `
    }, {
        iconLayout: 'default#image',
        iconImageHref: '/css/images/placelogo.png',
        iconImageSize: [25, 25],
        iconImageOffset: [-10, -10] // Отступ от центра
    })

    let placemark5 = new ymaps.Placemark([55.704394, 37.576730], {
        balloonContent: `
            <div class="balloon">
                <img class="balloon_image" src="/css/images/placesfoto/gagarina-1.jpg">
                <div class="balloon_text_block">
                  <div class="balloon_name"><h4><b>Pl. Gagarina</b></h4></div>
                  <div class="balloon_address"><h6>Moscow</h6></div>
                  <hr>
                  <div class="balloon_text">Dog walking areas are completely fenced areas
                   where dogs can spend time off-leash. The grounds come complete with special
                    dog training structures that have proven themselves in popular dog
                     competitions called agility.</div>
                  <div class="balloon_link"><a href="https://www.google.com/">Read more</a></div>
                </div>
            </div>
            `
    }, {
        iconLayout: 'default#image',
        iconImageHref: '/css/images/placelogo.png',
        iconImageSize: [25, 25],
        iconImageOffset: [-10, -10] // Отступ от центра
    })

    let placemark6 = new ymaps.Placemark([55.681022, 37.635278], {
        balloonContent: `
            <div class="balloon">
                <img class="balloon_image" src="/css/images/placesfoto/nagat-1.jpg">
                <div class="balloon_text_block">
                  <div class="balloon_name"><h4><b>Nagatinskaya</b></h4></div>
                  <div class="balloon_address"><h6>Moscow</h6></div>
                  <hr>
                  <div class="balloon_text">Dog walking areas are completely fenced areas
                   where dogs can spend time off-leash. The grounds come complete with special
                    dog training structures that have proven themselves in popular dog
                     competitions called agility.</div>
                  <div class="balloon_link"><a href="https://www.google.com/">Read more</a></div>
                </div>
            </div>
            `
    }, {
        iconLayout: 'default#image',
        iconImageHref: '/css/images/placelogo.png',
        iconImageSize: [25, 25],
        iconImageOffset: [-10, -10] // Отступ от центра
    })

    let placemark7 = new ymaps.Placemark([55.802518, 37.610539], {
        balloonContent: `
            <div class="balloon">
                <img class="balloon_image" src="/css/images/placesfoto/rosha-1.jpg">
                <div class="balloon_text_block">
                  <div class="balloon_name"><h4><b>Mariina Rosha</b></h4></div>
                  <div class="balloon_address"><h6>Moscow</h6></div>
                  <hr>
                  <div class="balloon_text">Dog walking areas are completely fenced areas
                   where dogs can spend time off-leash. The grounds come complete with special
                    dog training structures that have proven themselves in popular dog
                     competitions called agility.</div>
                  <div class="balloon_link"><a href="https://www.google.com/">Read more</a></div>
                </div>
            </div>
            `
    }, {
        iconLayout: 'default#image',
        iconImageHref: '/css/images/placelogo.png',
        iconImageSize: [25, 25],
        iconImageOffset: [-10, -10] // Отступ от центра
    })

    let placemark8 = new ymaps.Placemark([55.739306, 37.627626], {
        balloonContent: `
            <div class="balloon">
                <img class="balloon_image" src="/css/images/placesfoto/tretyak-1.jpg">
                <div class="balloon_text_block">
                  <div class="balloon_name"><h4><b>Tretyakovskaya</b></h4></div>
                  <div class="balloon_address"><h6>Moscow</h6></div>
                  <hr>
                  <div class="balloon_text">Dog walking areas are completely fenced areas
                   where dogs can spend time off-leash. The grounds come complete with special
                    dog training structures that have proven themselves in popular dog
                     competitions called agility.</div>
                  <div class="balloon_link"><a href="https://www.google.com/">Read more</a></div>
                </div>
            </div>
            `
    }, {
        iconLayout: 'default#image',
        iconImageHref: '/css/images/placelogo.png',
        iconImageSize: [25, 25],
        iconImageOffset: [-10, -10] // Отступ от центра
    })

    map.controls.remove('geolocationControl'); // удаляем геолокацию
    map.controls.remove('searchControl'); // удаляем поиск
    map.controls.remove('trafficControl'); // удаляем контроль трафика
    map.controls.remove('typeSelector'); // удаляем тип
    map.controls.remove('fullscreenControl'); // удаляем кнопку перехода в полноэкранный режим
    map.controls.remove('zoomControl'); // удаляем контрол зуммирования
    map.controls.remove('rulerControl'); // удаляем контрол правил
    map.behaviors.disable(['scrollZoom']); // отключаем скролл карты (опционально)

    map.geoObjects.add(placemark);
    map.geoObjects.add(placemark2);
    map.geoObjects.add(placemark3);
    // map.geoObjects.add(placemark4);
    map.geoObjects.add(placemark5);
    map.geoObjects.add(placemark6);
    map.geoObjects.add(placemark7);
    map.geoObjects.add(placemark8);
}

ymaps.ready(init);