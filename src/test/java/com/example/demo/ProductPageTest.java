package com.example.demo;

import com.codeborne.selenide.*;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeOptions;
import org.junit.jupiter.api.*;
import org.openqa.selenium.Rectangle;
import java.time.Duration;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;
import static org.junit.jupiter.api.Assertions.*;

public class ProductPageTest {

    @BeforeAll
    public static void setUpAll() {
        Configuration.browserSize = "1792x1120";
    }

    @BeforeEach
    public void setUp() {
        Configuration.browserCapabilities = new ChromeOptions().addArguments("--remote-allow-origins=*");
    }

    //тестирование проходит без авторизации в ВК

    @Test
    public void checkProductCardElements() {
        open("https://vk.com/club225299895?w=product-225299895_10044406");

        // Проверка наличия элементов на карточке товара
        $("div#wk_right > .wk_close_inner").shouldBe(visible);
        $(".vkuiIcon.vkuiIcon--28.vkuiIcon--add_square_outline_28.vkuiIcon--h-28.vkuiIcon--w-28 > use").shouldBe(visible);
        $(".vkuiHeadline--level-1.vkuiHeadline--sizeY-compact.vkuiSimpleCell__children.vkuiTypography.vkuiTypography--normalize.vkuiTypography--weight-3").shouldBe(visible);
        $(".ItemGallery__main").shouldBe(visible);
        $(".ItemGallery__placeholderIcon.vkuiIcon.vkuiIcon--56.vkuiIcon--camera_outline_56.vkuiIcon--h-56.vkuiIcon--w-56").shouldBe(visible);
        $(".ItemGallery__placeholderTitle").shouldBe(visible);
        $(".ItemCardControls-module__root--JtnOe .vkuiButton__in").shouldBe(visible);
        $(".ItemCardLayout__bottom").shouldBe(visible);
        $("div#page_bottom_banners_root > .PageBottomBanner.PageBottomBanner--animated.PageBottomBanner--bg-blue.PageBottomBanner--unauth").shouldBe(visible);
        $(".PageBottomBanner.PageBottomBanner--animated.PageBottomBanner--bg-blue.PageBottomBanner--unauth svg").shouldBe(visible);
        $(".PageBottomBanner__header").shouldBe(visible);
        $(".PageBottomBanner__text").shouldBe(visible);
        $(".PageBottomBanner__actions > button:nth-of-type(1)").shouldBe(visible);
        $(".PageBottomBanner__actions > button:nth-of-type(2)").shouldBe(visible);
        $(".ItemActions").shouldBe(visible);
        $(".ItemDescription.MarketItemCard__description").shouldBe(visible);
        $(".MarketItemCardShopInfo__content").shouldBe(visible);
        $("button[title='Нравится'] > ._like_button_icon.vkuiIcon.vkuiIcon--24.vkuiIcon--h-24.vkuiIcon--like_outline_24.vkuiIcon--w-24").shouldBe(visible);
        $(".ItemActions__count").shouldBe(visible);
        $("button[title='Поделиться'] > ._like_button_icon._share.vkuiIcon.vkuiIcon--24.vkuiIcon--h-24.vkuiIcon--share_outline_24.vkuiIcon--w-24").shouldBe(visible);
        $(".IconButton-module__rootNoPadding--ix1Ls.ItemActions__itemIcon.vkuiIconButton.vkuiIconButton--sizeY-compact.vkuiInternalTappable.vkuiTappable > .vkuiIcon.vkuiIcon--24.vkuiIcon--copy_24.vkuiIcon--h-24.vkuiIcon--w-24").shouldBe(visible);
        $("li:nth-of-type(3) > .IconButton-module__rootNoPadding--ix1Ls.ItemActions__itemIcon.vkuiIconButton.vkuiIconButton--sizeY-compact.vkuiInternalTappable.vkuiTappable > .ItemActions__itemText").shouldBe(visible);
        $(".IconButton-module__rootNoPadding--ix1Ls.ItemActions__itemIcon.vkuiIconButton.vkuiIconButton--sizeY-compact.vkuiInternalTappable.vkuiTappable > .vkuiIcon.vkuiIcon--20.vkuiIcon--bookmark_outline_16.vkuiIcon--h-20.vkuiIcon--w-20").shouldBe(visible);
        $("li:nth-of-type(4) > .IconButton-module__rootNoPadding--ix1Ls.ItemActions__itemIcon.vkuiIconButton.vkuiIconButton--sizeY-compact.vkuiInternalTappable.vkuiTappable > .ItemActions__itemText").shouldBe(visible);
        $(".vkuiIcon.vkuiIcon--24.vkuiIcon--h-24.vkuiIcon--list_like_outline_24.vkuiIcon--w-24 > use").shouldBe(visible);
        $("li:nth-of-type(5) > .IconButton-module__rootNoPadding--ix1Ls.ItemActions__itemIcon.vkuiIconButton.vkuiIconButton--sizeY-compact.vkuiInternalTappable.vkuiTappable > .ItemActions__itemText").shouldBe(visible);
        $(".ItemActions__itemText.ItemActions__itemTextDropdown").shouldBe(visible);
        $(".ItemActions__dropdownIcon.vkuiIcon.vkuiIcon--12.vkuiIcon--dropdown_12.vkuiIcon--h-8.vkuiIcon--w-12 > use").shouldBe(visible);
        $(".vkuiFootnote.vkuiTypography.vkuiTypography--normalize.vkuiTypography--weight-3").shouldBe(visible);
        $(".MarketItemCardShopInfo__title.vkuiTitle--level-2.vkuiTypography.vkuiTypography--normalize.vkuiTypography--weight-2").shouldBe(visible);
        $(".vkuiRichCell__before .vkuiImageBase__img").shouldBe(visible);
        $(".Link-module__link--V7bkY.MarketItemCardShopInfo__label.vkuiInternalTappable.vkuiLink.vkuiTappable").shouldBe(visible);
        $(".MarketItemCardShopInfo__membersCount").shouldBe(visible);
        $(".MarketItemCardShopInfo__content [type] .vkuiButton__content").shouldBe(visible);
        $(".MarketItemCardShopInfo__content [target] .vkuiButton__content").shouldBe(visible);
        $(".PageBottomBanner__content").shouldBe(visible);
        $(".PageBottomBanner__actions").shouldBe(visible);


        // Проверка текста названия элемента
        SelenideElement itemNameElement = $(".ItemName"); // Находим элемент
        itemNameElement.shouldHave(text("For testing test")); // Проверяем текст
        SelenideElement itemAuthorElement = $(".ItemAuthor-module__label--Ofu1E.Link-module__link--V7bkY.vkuiInternalTappable.vkuiLink.vkuiTappable"); // Находим элемент
        itemAuthorElement.shouldHave(text("Test public for test")); // Проверяем текст
        SelenideElement itemPriceElement = $(".ItemPrice-module__actual--lyqkb > span"); // Находим элемент
        itemPriceElement.shouldHave(text("бесплатно")); // Проверяем текст
        SelenideElement itemDescriptionElement = $(".ItemDescription.MarketItemCard__description"); // Находим элемент
        itemDescriptionElement.shouldHave(text("testing product")); // Проверяем текст
        SelenideElement itemShopElement = $(".MarketItemCardShopInfo__title.vkuiTitle--level-2.vkuiTypography.vkuiTypography--normalize.vkuiTypography--weight-2"); // Находим элемент
        itemShopElement.shouldHave(text("О продавце")); // Проверяем текст
        SelenideElement itemBottomheaderElement = $(".PageBottomBanner__header"); // Находим элемент
        itemBottomheaderElement.shouldHave(text("Следите за новостями сообщества")); // Проверяем текст
        SelenideElement itemBottomtextElement = $(".PageBottomBanner__text"); // Находим элемент
        itemBottomtextElement.shouldHave(text("Не пропускайте новые записи любимого сообщества — войдите в аккаунт и подпишитесь на него.")); // Проверяем текст

        // Проверка атрибута элемента
        $(".vkuiSimpleCell__before .vkuiImageBase__img").shouldHave(attribute("src", "https://sun1-19.userapi.com/impf/XflwIQpiW7eTSf95MQ-Nver647DeVm2WJTC3rw/H-QugqVUlkA.jpg?quality=96&as=32x32,48x48,72x72,108x108,160x160,240x240,360x360&sign=61027d210ccb0a59d7af739beb9110ba&u=aNilTjpajNGXznoAFiBsCyhWBvZZx5t-H0ovp9gVz-s&cs=50x50"));
        $(".vkuiRichCell__before .vkuiImageBase__img").shouldHave(attribute("src", "https://sun1-19.userapi.com/impf/XflwIQpiW7eTSf95MQ-Nver647DeVm2WJTC3rw/H-QugqVUlkA.jpg?quality=96&as=32x32,48x48,72x72,108x108,160x160,240x240,360x360&sign=61027d210ccb0a59d7af739beb9110ba&u=aNilTjpajNGXznoAFiBsCyhWBvZZx5t-H0ovp9gVz-s&cs=50x50"));

        // Проверка наличия SVG элементов
        SelenideElement svgElement1 = $(".ItemAuthor-module__iconSubscribe--B8JE9.vkuiIconButton.vkuiIconButton--sizeY-compact.vkuiInternalTappable.vkuiTappable > .vkuiIcon.vkuiIcon--28.vkuiIcon--add_square_outline_28.vkuiIcon--h-28.vkuiIcon--w-28"); // Находим SVG элемент
        svgElement1.shouldBe(visible); // Проверяем, что SVG элемент есть
        SelenideElement svgElement2 = $(".ItemGallery__placeholderIcon.vkuiIcon.vkuiIcon--56.vkuiIcon--camera_outline_56.vkuiIcon--h-56.vkuiIcon--w-56"); // Находим SVG элемент
        svgElement2.shouldBe(visible); // Проверяем, что SVG элемент есть
        SelenideElement svgElement3 = $(".PageBottomBanner.PageBottomBanner--animated.PageBottomBanner--bg-blue.PageBottomBanner--unauth svg"); // Находим SVG элемент
        svgElement3.shouldBe(visible); // Проверяем, что SVG элемент есть
        SelenideElement svgElement4 = $("button[title='Нравится'] > ._like_button_icon.vkuiIcon.vkuiIcon--24.vkuiIcon--h-24.vkuiIcon--like_outline_24.vkuiIcon--w-24"); // Находим SVG элемент
        svgElement4.shouldBe(visible); // Проверяем, что SVG элемент есть
        SelenideElement svgElement5 = $("button[title='Поделиться'] > ._like_button_icon._share.vkuiIcon.vkuiIcon--24.vkuiIcon--h-24.vkuiIcon--share_outline_24.vkuiIcon--w-24"); // Находим SVG элемент
        svgElement5.shouldBe(visible); // Проверяем, что SVG элемент есть
        SelenideElement svgElement6 = $(".IconButton-module__rootNoPadding--ix1Ls.ItemActions__itemIcon.vkuiIconButton.vkuiIconButton--sizeY-compact.vkuiInternalTappable.vkuiTappable > .vkuiIcon.vkuiIcon--24.vkuiIcon--copy_24.vkuiIcon--h-24.vkuiIcon--w-24"); // Находим SVG элемент
        svgElement6.shouldBe(visible); // Проверяем, что SVG элемент есть
        SelenideElement svgElement7 = $(".IconButton-module__rootNoPadding--ix1Ls.ItemActions__itemIcon.vkuiIconButton.vkuiIconButton--sizeY-compact.vkuiInternalTappable.vkuiTappable > .vkuiIcon.vkuiIcon--20.vkuiIcon--bookmark_outline_16.vkuiIcon--h-20.vkuiIcon--w-20"); // Находим SVG элемент
        svgElement7.shouldBe(visible); // Проверяем, что SVG элемент есть
        SelenideElement svgElement8 = $(".IconButton-module__rootNoPadding--ix1Ls.ItemActions__itemIcon.vkuiIconButton.vkuiIconButton--sizeY-compact.vkuiInternalTappable.vkuiTappable > .vkuiIcon.vkuiIcon--24.vkuiIcon--h-24.vkuiIcon--list_like_outline_24.vkuiIcon--w-24"); // Находим SVG элемент
        svgElement8.shouldBe(visible); // Проверяем, что SVG элемент есть

        // Нажатие на кнопку подписаться (плюс в квадрате)
        SelenideElement buttonElement1 = $(".ItemAuthor-module__iconSubscribe--B8JE9.vkuiIconButton.vkuiIconButton--sizeY-compact.vkuiInternalTappable.vkuiTappable > .vkuiIcon.vkuiIcon--28.vkuiIcon--add_square_outline_28.vkuiIcon--h-28.vkuiIcon--w-28"); // Находим кнопку
        buttonElement1.click(); // Нажимаем на кнопку
        // Проверка перенаправления на новую страницу
        String expectedUrl1 = "https://vk.com/login"; // Ожидаемый URL
        open(expectedUrl1); // Проверяем, что URL страницы соответствует ожидаемому

        //Возврат
        open("https://vk.com/club225299895?w=product-225299895_10044406");

        // Нажатие на кнопку закрыть модульное окно (крестик)
        SelenideElement buttonElement2 = $("div#wk_right > .wk_close_inner"); // Находим кнопку
        buttonElement2.click(); // Нажимаем на кнопку
        // Проверка перенаправления на новую страницу
        String expectedUrl2 = "https://vk.com/club225299895"; // Ожидаемый URL
        open(expectedUrl2); // Проверяем, что URL страницы соответствует ожидаемому

        //Возврат
        open("https://vk.com/club225299895?w=product-225299895_10044406");

        // Нажатие на кнопку клуба справе вверху (большая круглая иконка с человечками)
        SelenideElement buttonElement3 = $(".vkuiSimpleCell__before .vkuiImageBase__img"); // Находим кнопку
        buttonElement3.click(); // Нажимаем на кнопку
        // Проверка перенаправления на новую страницу
        String expectedUrl3 = "https://vk.com/club225299895"; // Ожидаемый URL
        open(expectedUrl3); // Проверяем, что URL страницы соответствует ожидаемому

        //Возврат
        open("https://vk.com/club225299895?w=product-225299895_10044406");

        // Нажатие на кнопку написать
        SelenideElement buttonElement4 = $(".ItemCardControls-module__root--JtnOe .vkuiButton__in"); // Находим кнопку
        buttonElement4.click(); // Нажимаем на кнопку
        // Проверка перенаправления на новую страницу
        String expectedUrl4 = "https://vk.com/login"; // Ожидаемый URL
        open(expectedUrl4); // Проверяем, что URL страницы соответствует ожидаемому

        //Возврат
        open("https://vk.com/club225299895?w=product-225299895_10044406");

        // Нажатие на иконку лайк (сердечко)
        SelenideElement buttonElement5 = $("button[title='Нравится'] > ._like_button_icon.vkuiIcon.vkuiIcon--24.vkuiIcon--h-24.vkuiIcon--like_outline_24.vkuiIcon--w-24"); // Находим иконку
        buttonElement5.click(); // Нажимаем на иконку
        // Проверка перенаправления на новую страницу
        String expectedUrl5 = "https://vk.com/login"; // Ожидаемый URL
        open(expectedUrl5); // Проверяем, что URL страницы соответствует ожидаемому

        //Возврат
        open("https://vk.com/club225299895?w=product-225299895_10044406");

        // Нажатие на иконку поделиться
        SelenideElement buttonElement6 = $("button[title='Поделиться'] > ._like_button_icon._share.vkuiIcon.vkuiIcon--24.vkuiIcon--h-24.vkuiIcon--share_outline_24.vkuiIcon--w-24"); // Находим иконку
        buttonElement6.click(); // Нажимаем на иконку
        // Проверка перенаправления на новую страницу
        String expectedUrl6 = "https://vk.com/login"; // Ожидаемый URL
        open(expectedUrl6); // Проверяем, что URL страницы соответствует ожидаемому

        //Возврат
        open("https://vk.com/club225299895?w=product-225299895_10044406");

        // Нажатие на иконку скопировать ссылку
        SelenideElement buttonElement7 = $(".IconButton-module__rootNoPadding--ix1Ls.ItemActions__itemIcon.vkuiIconButton.vkuiIconButton--sizeY-compact.vkuiInternalTappable.vkuiTappable > .vkuiIcon.vkuiIcon--24.vkuiIcon--copy_24.vkuiIcon--h-24.vkuiIcon--w-24"); // Находим иконку
        buttonElement7.click(); // Нажимаем на иконку
        // Проверка перенаправления на новую страницу
        String expectedUrl7 = "https://vk.com/login"; // Ожидаемый URL
        open(expectedUrl7); // Проверяем, что URL страницы соответствует ожидаемому

        //Возврат
        open("https://vk.com/club225299895?w=product-225299895_10044406");

        // Нажатие на иконку в закладки
        SelenideElement buttonElement8 = $(".IconButton-module__rootNoPadding--ix1Ls.ItemActions__itemIcon.vkuiIconButton.vkuiIconButton--sizeY-compact.vkuiInternalTappable.vkuiTappable > .vkuiIcon.vkuiIcon--20.vkuiIcon--bookmark_outline_16.vkuiIcon--h-20.vkuiIcon--w-20"); // Находим иконку
        buttonElement8.click(); // Нажимаем на иконку
        // Проверка перенаправления на новую страницу
        String expectedUrl8 = "https://vk.com/login"; // Ожидаемый URL
        open(expectedUrl8); // Проверяем, что URL страницы соответствует ожидаемому

        //Возврат
        open("https://vk.com/club225299895?w=product-225299895_10044406");

        // Нажатие на иконку в желания
        SelenideElement buttonElement9 = $(".IconButton-module__rootNoPadding--ix1Ls.ItemActions__itemIcon.vkuiIconButton.vkuiIconButton--sizeY-compact.vkuiInternalTappable.vkuiTappable > .vkuiIcon.vkuiIcon--24.vkuiIcon--h-24.vkuiIcon--list_like_outline_24.vkuiIcon--w-24"); // Находим иконку
        buttonElement9.click(); // Нажимаем на иконку
        // Проверка перенаправления на новую страницу
        String expectedUrl9 = "https://vk.com/login"; // Ожидаемый URL
        open(expectedUrl9); // Проверяем, что URL страницы соответствует ожидаемому

        //Возврат
        open("https://vk.com/club225299895?w=product-225299895_10044406");

        // Нажатие на надпись скопировать ссылку
        SelenideElement buttonElement10 = $(".IconButton-module__rootNoPadding--ix1Ls.ItemActions__itemIcon.vkuiIconButton.vkuiIconButton--sizeY-compact.vkuiInternalTappable.vkuiTappable > .vkuiIcon.vkuiIcon--24.vkuiIcon--h-24.vkuiIcon--list_like_outline_24.vkuiIcon--w-24"); // Находим надпись
        buttonElement10.click(); // Нажимаем на надпись
        // Проверка перенаправления на новую страницу
        String expectedUrl10 = "https://vk.com/login"; // Ожидаемый URL
        open(expectedUrl10); // Проверяем, что URL страницы соответствует ожидаемому

        //Возврат
        open("https://vk.com/club225299895?w=product-225299895_10044406");

        // Нажатие на надпись в закладки
        SelenideElement buttonElement11 = $("li:nth-of-type(4) > .IconButton-module__rootNoPadding--ix1Ls.ItemActions__itemIcon.vkuiIconButton.vkuiIconButton--sizeY-compact.vkuiInternalTappable.vkuiTappable > .ItemActions__itemText"); // Находим надпись
        buttonElement11.click(); // Нажимаем на надпись
        // Проверка перенаправления на новую страницу
        String expectedUrl11 = "https://vk.com/login"; // Ожидаемый URL
        open(expectedUrl11); // Проверяем, что URL страницы соответствует ожидаемому

        //Возврат
        open("https://vk.com/club225299895?w=product-225299895_10044406");

        // Нажатие на надпись в желания
        SelenideElement buttonElement12 = $("li:nth-of-type(5) > .IconButton-module__rootNoPadding--ix1Ls.ItemActions__itemIcon.vkuiIconButton.vkuiIconButton--sizeY-compact.vkuiInternalTappable.vkuiTappable > .ItemActions__itemText"); // Находим надпись
        buttonElement12.click(); // Нажимаем на надпись
        // Проверка перенаправления на новую страницу
        String expectedUrl12 = "https://vk.com/login"; // Ожидаемый URL
        open(expectedUrl12); // Проверяем, что URL страницы соответствует ожидаемому

        //Возврат
        open("https://vk.com/club225299895?w=product-225299895_10044406");

        // Нажатие на надпись названия клуба сверху справа
        SelenideElement buttonElement13 = $(".ItemAuthor-module__label--Ofu1E.Link-module__link--V7bkY.vkuiInternalTappable.vkuiLink.vkuiTappable"); // Находим надпись
        buttonElement13.click(); // Нажимаем на надпись
        // Проверка перенаправления на новую страницу
        String expectedUrl13 = "https://vk.com/club225299895"; // Ожидаемый URL
        open(expectedUrl13); // Проверяем, что URL страницы соответствует ожидаемому

        //Возврат
        open("https://vk.com/club225299895?w=product-225299895_10044406");

        SelenideElement buttonElement14 = $(".Link-module__link--V7bkY.MarketItemCardShopInfo__label.vkuiInternalTappable.vkuiLink.vkuiTappable"); // Находим надпись
        buttonElement14.click(); // Нажимаем на надпись
        // Проверка перенаправления на новую страницу
        String expectedUrl14 = "https://vk.com/club225299895"; // Ожидаемый URL
        open(expectedUrl14); // Проверяем, что URL страницы соответствует ожидаемому

        //Возврат
        open("https://vk.com/club225299895?w=product-225299895_10044406");

        // Нажатие на надпись подписчик/и внизу слева
        SelenideElement buttonElement15 = $(".MarketItemCardShopInfo__membersCount"); // Находим надпись
        buttonElement15.click(); // Нажимаем на надпись
        // Проверка перенаправления на новую страницу
        String expectedUrl15 = "https://vk.com/login"; // Ожидаемый URL
        open(expectedUrl15); // Проверяем, что URL страницы соответствует ожидаемому

        //Возврат
        open("https://vk.com/club225299895?w=product-225299895_10044406");

        // Нажатие на кнопку клуба слева внизу (большая круглая иконка с человечками)
        SelenideElement buttonElement16 = $(".vkuiRichCell__before .vkuiImageBase__img"); // Находим кнопку
        buttonElement16.click(); // Нажимаем на кнопку
        // Проверка перенаправления на новую страницу
        String expectedUrl16 = "https://vk.com/club225299895"; // Ожидаемый URL
        open(expectedUrl16); // Проверяем, что URL страницы соответствует ожидаемому

        //Возврат
        open("https://vk.com/club225299895?w=product-225299895_10044406");

        // Нажатие на кнопку подписаться внизу
        SelenideElement buttonElement17 = $(".MarketItemCardShopInfo__content [type] .vkuiButton__in"); // Находим кнопку
        buttonElement17.click(); // Нажимаем на кнопку
        // Проверка перенаправления на новую страницу
        String expectedUrl17 = "https://vk.com/login"; // Ожидаемый URL
        open(expectedUrl17); // Проверяем, что URL страницы соответствует ожидаемому

        //Возврат
        open("https://vk.com/club225299895?w=product-225299895_10044406");

        // Нажатие на кнопку перейти в магазин внизу
        SelenideElement buttonElement18 = $(".MarketItemCardShopInfo__content [target] .vkuiButton__in"); // Находим кнопку
        buttonElement18.click(); // Нажимаем на кнопку
        // Проверка перенаправления на новую страницу на новой закладке
        String expectedUrl18 = "https://vk.com/uslugi-225299895"; // Ожидаемый URL
        open(expectedUrl18); // Проверяем, что URL страницы соответствует ожидаемому
        // Закрытие
        Selenide.closeWindow();

        //Возврат
        open("https://vk.com/club225299895?w=product-225299895_10044406");

        // Добавляем задержку чтобы всплыла нижняя лента
        sleep(1500); // Задержка в 1,5 секунды

        // Наведение мыши на элемент
        SelenideElement hoverElement1 = $(".PageBottomBanner__actions > button:nth-of-type(2)"); // Находим элемент
        hoverElement1.hover(); // Наводим мышь на элемент
        // Нажатие на кнопку войти внизу
        SelenideElement buttonElement19 = $(By.xpath("/html//div[@id='page_bottom_banners_root']//button[.='Войти']")); // Находим кнопку
        buttonElement19.shouldBe(visible); // Ждем, пока кнопка станет видимой
        buttonElement19.click(); // Нажимаем на кнопку
        // Проверка перенаправления на новую страницу на новой закладке
        String expectedUrl19 = "https://vk.com/login"; // Ожидаемый URL
        open(expectedUrl19); // Проверяем, что URL страницы соответствует ожидаемому

        //Возврат
        open("https://vk.com/club225299895?w=product-225299895_10044406");

        // Добавляем задержку чтобы всплыла нижняя лента
        sleep(1500); // Задержка в 1,5 секунды

        // Наведение мыши на элемент и проверка всплывающего окна понравилось
        SelenideElement likeButtonElement1 = $("._like_button_icon.vkuiIcon.vkuiIcon--24.vkuiIcon--h-24.vkuiIcon--like_outline_24.vkuiIcon--w-24"); // Находим элемент
        likeButtonElement1.hover(); // Наводим мышь на элемент
        sleep(3000); // Задержка в 3 секунды
        SelenideElement tooltipElement1 = $("._title"); // Находим всплывающее окно
        tooltipElement1.shouldBe(visible); // Проверяем, что всплывающее окно видимо

        // Наведение мыши на элемент и проверка всплывающей подсказки Нравится
        //SelenideElement likeButtonElement2 = $("._like_button_icon.vkuiIcon.vkuiIcon--24.vkuiIcon--h-24.vkuiIcon--like_outline_24.vkuiIcon--w-24"); // Находим элемент
        //likeButtonElement2.hover(); // Наводим мышь на элемент
        // Проверка всплывающей подсказки
        //String expectedTooltip2 = "Нравится"; // Ожидаемый текст подсказки
        //likeButtonElement2.parent().shouldHave(attribute("title", expectedTooltip2)); // Проверяем, что всплывающая подсказка соответствует ожидаемой

        // Наведение мыши на элемент и проверка всплывающей подсказки Поделиться
        //SelenideElement likeButtonElement3 = $("._like_button_icon._share.vkuiIcon.vkuiIcon--24.vkuiIcon--h-24.vkuiIcon--share_outline_24.vkuiIcon--w-24"); // Находим элемент
        //likeButtonElement3.hover(); // Наводим мышь на элемент
        // Проверка всплывающей подсказки
        //String expectedTooltip3 = "Поделиться"; // Ожидаемый текст подсказки
        //likeButtonElement3.parent().shouldHave(attribute("title", expectedTooltip3)); // Проверяем, что всплывающая подсказка соответствует ожидаемой

        // Наведение мыши на надпись "Ещё"
        SelenideElement moreButton1 = $(".ItemActions__itemText.ItemActions__itemTextDropdown");
        moreButton1.hover();

        // Нажатие на всплывающую кнопку
        SelenideElement dropdownButton1 = $(".Dropdown__in > .Dropdown__item");
        dropdownButton1.click();

        // Проверка открытия модального окна "Пожаловаться"
        SelenideElement modalWindow1 = $("div[role='dialog'] > .ModalHeader-module__container--KpSGM");
        modalWindow1.shouldBe(Condition.visible);

        // Нажатие на кнопку "закрыть" в виде крестика
        SelenideElement closeButton1 = $(".vkuiIcon.vkuiIcon--20.vkuiIcon--cancel_20.vkuiIcon--h-20.vkuiIcon--w-20 > use");
        closeButton1.click();

        // Проверка закрытия модального окна
        modalWindow1.shouldNotBe(Condition.visible);

        // Наведение мыши на иконку лайк
        SelenideElement moreButton2 = $("._like_button_icon.vkuiIcon.vkuiIcon--24.vkuiIcon--h-24.vkuiIcon--like_outline_24.vkuiIcon--w-24 > use");
        moreButton2.hover();
        sleep(3000); // Задержка в 3 секунды
        // Нажатие на всплывающую надпись понравилось...
        SelenideElement dropdownButton2 = $(By.xpath("//span[@class='_title']"));
        dropdownButton2.click();

        // Проверка открытия модального окна с информацией о пользователях которым понравилось
        SelenideElement modalWindow2 = $("div#wk_likes_rows");
        modalWindow2.shouldBe(Condition.visible);

        // Нажатие на кнопку "закрыть" в виде крестика
        SelenideElement closeButton2 = $("#wk_right");
        closeButton2.click();

        // Проверка закрытия модального окна
        modalWindow2.shouldNotBe(Condition.visible);


    }

    @Test
    public void search() throws InterruptedException {
        Thread.sleep(5000);
    }

    @Test
    public void checkCommunityMainPageElements() {
        open("https://vk.com/club225299895");

        // Проверка наличия элементов на главной странице сообщества
        $("div#page_actions  .FlatButton__in").shouldBe(visible);
        $(".page_name").shouldBe(visible);
        $(".TopHomeLink > svg").shouldBe(visible);
        $(".TopHomeLink > svg > g > g > path:nth-of-type(2)").shouldBe(visible);
        $("input#ts_input").shouldBe(visible);
        $("a#top_reg_link").shouldBe(visible);
        $(".AvatarRich.AvatarRich--shadow.AvatarRich--sz-100.redesigned-group-avatar-outline").shouldBe(visible);
        $("div#quick_login > .button_wide.flat_button.quick_login_button").shouldBe(visible);
        $("button#quick_reg_button").shouldBe(visible);
        $("[id='music_outline_20__Icons-20\\/music_outline_20'] [fill]").shouldBe(visible);
        $("li#l_aud  .LeftMenu__itemLabel").shouldBe(visible);
        $("li#l_vid svg").shouldBe(visible);
        $("li#l_vid  .LeftMenu__itemLabel").shouldBe(visible);
        $("li#l_gr svg > path").shouldBe(visible);
        $("li#l_gr  .LeftMenu__itemLabel").shouldBe(visible);
        $("li#l_mini_apps svg").shouldBe(visible);
        $("li#l_gr svg").shouldBe(visible);
        $("li#l_mini_apps  .LeftMenu__itemLabel").shouldBe(visible);
        $(".TopHomeLink > svg").shouldBe(visible);
        $("li#l_ap svg > path").shouldBe(visible);
        $("li#l_ap  .LeftMenu__itemLabel").shouldBe(visible);
        $("div:nth-of-type(5) > .LeftMenuAppPromo__link").shouldBe(visible);
        $("div:nth-of-type(5) > .LeftMenuAppPromo__icon > svg").shouldBe(visible);
        $("div:nth-of-type(7) > .LeftMenuAppPromo__icon > svg > path:nth-of-type(1)").shouldBe(visible);
        $("div:nth-of-type(7) > .LeftMenuAppPromo__link").shouldBe(visible);
        $("h2#group_tabs").shouldBe(visible);
        $(".line_value").shouldBe(visible);
        $(".people_row").shouldBe(visible);
        $("div#group_contacts  .clear_fix.header_top").shouldBe(visible);
        $("h2#wall_tabs").shouldBe(visible);
        $(".EcommPreviewProductCardProductPicture__img").shouldBe(visible);
        $(".ui_gallery_item.ui_tab.ui_tab_new.ui_tab_sel > .ui_tab_content_new").shouldBe(visible);
        $("div#page_group_info_block svg > path:nth-of-type(1)").shouldBe(visible);
        $(".groups-redesigned-info-more").shouldBe(visible);
        $("div#group_followers .fl_l.header_label").shouldBe(visible);
        $(".AvatarRich.AvatarRich--shadow.AvatarRich--sz-64").shouldBe(visible);
        $(".people_cell_name").shouldBe(visible);
        $("div#group_contacts .fl_l.header_label").shouldBe(visible);
        $("div#group_contacts .fl_l.header_count").shouldBe(visible);
        $("div#group_followers .fl_l.header_count").shouldBe(visible);
        $(".fl_l.info").shouldBe(visible);
        $(".AvatarRich.AvatarRich--shadow.AvatarRich--sz-48").shouldBe(visible);
        $(".ui_gallery_item.ui_tab.ui_tab_new.ui_tab_sel > svg > path:nth-of-type(1)").shouldBe(visible);
        $(".MarketGroupSectionServices > .MarketItemPreviewList").shouldBe(visible);
        $(".EcommPreviewProductCardProductPrice__main").shouldBe(visible);
        $(".FlatButton.FlatButton--secondary.FlatButton--size-l.FlatButton--wide > .FlatButton__in").shouldBe(visible);
        $(".FlatButton.FlatButton--secondary.FlatButton--size-l.FlatButton--wide  .FlatButton__content").shouldBe(visible);
        $(".ui_tab_plain.ui_tab_plain_new.ui_tab_search  svg").shouldBe(visible);
        $("h2#wall_tabs").shouldBe(visible);
        $("div#page_wall_posts").shouldBe(visible);
        $("div#page_wall_posts svg").shouldBe(visible);
        $("._wall_tab_all > .ui_tab.ui_tab_new.ui_tab_sel").shouldBe(visible);
        $("[onclick='return wall\\.switchWall\\(this\\, event\\, \\'own\\'\\)\\;']").shouldBe(visible);
        $("div#page_bottom_banners_root svg > path").shouldBe(visible);
        $(".PageBottomBanner__header").shouldBe(visible);
        $(".PageBottomBanner__text").shouldBe(visible);
        $(".PageBottomBanner__actions > button:nth-of-type(1)").shouldBe(visible);
        $(".PageBottomBanner__actions > button:nth-of-type(2)").shouldBe(visible);
        $(".PageBottomBanner--animated").shouldBe(visible);
        $(".redesigned-group-cover__img._page_cover").shouldBe(visible);
        $("div#page_header_wrap").shouldBe(visible);
        $(".page_name").shouldBe(visible);
        $("div#page_subscribers  span").shouldBe(visible);
        $("div#page_subscribers > .redesigned-group-subscribers").shouldBe(visible);
        $(".PageBottomBanner__content").shouldBe(visible);
        $(".PageBottomBanner__actions").shouldBe(visible);

        // Проверка наличия SVG элементов
        SelenideElement svgElement9 = $("li#l_aud svg"); // Находим SVG элемент
        svgElement9.shouldBe(visible); // Проверяем, что SVG элемент есть
        SelenideElement svgElement10 = $("li#l_vid svg"); // Находим SVG элемент
        svgElement10.shouldBe(visible); // Проверяем, что SVG элемент есть
        SelenideElement svgElement11 = $("li#l_gr svg"); // Находим SVG элемент
        svgElement11.shouldBe(visible); // Проверяем, что SVG элемент есть
        SelenideElement svgElement12 = $("li#l_mini_apps svg"); // Находим SVG элемент
        svgElement12.shouldBe(visible); // Проверяем, что SVG элемент есть
        SelenideElement svgElement13 = $("li#l_ap svg"); // Находим SVG элемент
        svgElement13.shouldBe(visible); // Проверяем, что SVG элемент есть
        SelenideElement svgElement14 = $("div:nth-of-type(5) > .LeftMenuAppPromo__icon > svg > path:nth-of-type(1)"); // Находим SVG элемент
        svgElement14.shouldBe(visible); // Проверяем, что SVG элемент есть
        SelenideElement svgElement15 = $("div:nth-of-type(7) > .LeftMenuAppPromo__icon > svg"); // Находим SVG элемент
        svgElement15.shouldBe(visible); // Проверяем, что SVG элемент есть
        SelenideElement svgElement16 = $(".ui_gallery_item.ui_tab.ui_tab_new.ui_tab_sel > svg"); // Находим SVG элемент
        svgElement16.shouldBe(visible); // Проверяем, что SVG элемент есть
        SelenideElement svgElement17 = $("div#page_group_info_block svg > path:nth-of-type(1)"); // Находим SVG элемент
        svgElement17.shouldBe(visible); // Проверяем, что SVG элемент есть
        SelenideElement svgElement18 = $(".TopHomeLink > svg > g > g > path:nth-of-type(2)"); // Находим SVG элемент
        svgElement18.shouldBe(visible); // Проверяем, что SVG элемент есть
        SelenideElement svgElement19 = $(".ui_tab_plain.ui_tab_plain_new.ui_tab_search  svg"); // Находим SVG элемент
        svgElement19.shouldBe(visible); // Проверяем, что SVG элемент есть
        SelenideElement svgElement20 = $("div#page_bottom_banners_root svg > path"); // Находим SVG элемент
        svgElement20.shouldBe(visible); // Проверяем, что SVG элемент есть
        SelenideElement svgElement21 = $("div#page_wall_posts svg"); // Находим SVG элемент
        svgElement21.shouldBe(visible); // Проверяем, что SVG элемент есть

        // Нажатие на кнопку подписаться
        SelenideElement buttonElement19 = $("div#page_actions .FlatButton__content"); // Находим кнопку
        buttonElement19.click(); // Нажимаем на кнопку
        // Проверка перенаправления на новую страницу
        String expectedUrl19 = "https://vk.com/login"; // Ожидаемый URL
        open(expectedUrl19); // Проверяем, что URL страницы соответствует ожидаемому

        //Возврат
        open("https://vk.com/club225299895");

        // Нажатие на надпись подробная информация, клик по котороой открывает модальное окно
        SelenideElement elementToClick = $(".groups-redesigned-info-more");
        // Клик по надписи
        elementToClick.click();
        // Ожидание появления модального окна
        SelenideElement modal = $(".group-info-box").shouldBe(visible, Duration.ofSeconds(5));
        // Проверка, что модальное окно открылось
        assertTrue(modal.isDisplayed());
        // Получение размеров и координат модального окна
        Rectangle modalRect = modal.getRect();
        // Расчет координат точки справа от модального окна
        int xOffset = modalRect.getWidth() + 10; // Отступ от правого края окна
        int yCoordinate = modalRect.getY() + modalRect.getHeight() / 2; // Середина высоты окна
        // Клик по точке справа от модального окна
        Selenide.actions().moveToElement(modal, xOffset, yCoordinate).click().perform();
        // Проверка, что модальное окно закрылось
        assertFalse(modal.isDisplayed());

        //Возврат
        open("https://vk.com/club225299895");

        // Нажатие на кнопку услуги
        SelenideElement buttonElement20 = $(".ui_gallery_item.ui_tab.ui_tab_new.ui_tab_sel"); // Находим кнопку
        buttonElement20.click(); // Нажимаем на кнопку
        // Проверка перенаправления на новую страницу
        String expectedUrl20 = "https://vk.com/club225299895"; // Ожидаемый URL
        open(expectedUrl20); // Проверяем, что URL страницы соответствует ожидаемому

        // Нажатие на кнопку продукта
        SelenideElement buttonElement21 = $(".EcommPreviewProductCardProductPicture__img"); // Находим кнопку
        buttonElement21.click(); // Нажимаем на кнопку
        // Проверка перенаправления на новую страницу
        String expectedUrl21 = "https://vk.com/club225299895?w=product-225299895_10044406"; // Ожидаемый URL
        open(expectedUrl21); // Проверяем, что URL страницы соответствует ожидаемому

        //Возврат
        open("https://vk.com/club225299895");

        // Нажатие на кнопку названия продукта (под большой кнопкой)
        SelenideElement buttonElement22 = $("a[title='For testing test']"); // Находим кнопку
        buttonElement22.click(); // Нажимаем на кнопку
        // Проверка перенаправления на новую страницу
        String expectedUrl22 = "https://vk.com/club225299895?w=product-225299895_10044406"; // Ожидаемый URL
        open(expectedUrl22); // Проверяем, что URL страницы соответствует ожидаемому

        //Возврат
        open("https://vk.com/club225299895");

        // Нажатие на кнопку названия показать все на карточке продукта (под большой кнопкой)
        SelenideElement buttonElement23 = $(".FlatButton.FlatButton--secondary.FlatButton--size-l.FlatButton--wide"); // Находим кнопку
        buttonElement23.click(); // Нажимаем на кнопку
        // Проверка перенаправления на новую страницу
        String expectedUrl23 = "https://vk.com/uslugi-225299895?screen=group"; // Ожидаемый URL
        open(expectedUrl23); // Проверяем, что URL страницы соответствует ожидаемому

        //Возврат
        open("https://vk.com/club225299895");

        // Нажатие на кнопку все записи
        SelenideElement buttonElement24 = $("._wall_tab_all [onclick]"); // Находим кнопку
        buttonElement24.click(); // Нажимаем на кнопку
        // Проверка перенаправления на новую страницу
        String expectedUrl24 = "https://vk.com/wall-225299895"; // Ожидаемый URL
        open(expectedUrl24); // Проверяем, что URL страницы соответствует ожидаемому

        //Возврат
        open("https://vk.com/club225299895");

        // Нажатие на кнопку записи сообщества
        SelenideElement buttonElement25 = $(By.xpath("//h2[@id='wall_tabs']/ul//a[@href='/wall-225299895?own=1']/span[@class='ui_tab_content_new']")); // Находим кнопку
        buttonElement25.click(); // Нажимаем на кнопку
        // Проверка перенаправления на новую страницу
        String expectedUrl25 = "https://vk.com/wall-225299895?own=1"; // Ожидаемый URL
        open(expectedUrl25); // Проверяем, что URL страницы соответствует ожидаемому

        //Возврат
        open("https://vk.com/club225299895");

        // Нажатие на иконку поиска (увелечительное стекло)
        // Поиск иконки для открытия поля поиска
        SelenideElement searchIcon = $(".ui_tab_plain.ui_tab_plain_new.ui_tab_search");
        searchIcon.click(); // Клик по иконке поиска
        SelenideElement searchInput = $(By.cssSelector("input#wall_search")).shouldBe(visible, Duration.ofSeconds(5));// Ожидание появления поля ввода
        assertTrue(searchInput.isDisplayed());// Проверка, что поле ввода появилось
        SelenideElement closeIcon = $(".ui_search_reset_close");// Поиск иконки закрытия поля поиска
        closeIcon.click();// Клик по иконке закрытия
        assertFalse(searchInput.isDisplayed());// Проверка, что поле ввода скрылось

        //Возврат
        open("https://vk.com/club225299895");

        // Нажатие на надпись подписчики в поле подписчики
        SelenideElement buttonElement26 = $(By.xpath("//div[@id='group_followers']/a[@href='/search?c[section]=people&reload=1&c[group]=225299895']//span[.='Подписчики']")); // Находим кнопку
        buttonElement26.click(); // Нажимаем на кнопку
        // Проверка перенаправления на новую страницу
        String expectedUrl26 = "https://vk.com/login"; // Ожидаемый URL
        open(expectedUrl26); // Проверяем, что URL страницы соответствует ожидаемому

        //Возврат
        open("https://vk.com/club225299895");

        // Нажатие на имя подписчика
        SelenideElement buttonElement27 = $(By.xpath("//div[@id='group_followers']/div[2]//a[@title='Костя Жуков']")); // Находим кнопку
        buttonElement27.click(); // Нажимаем на кнопку
        // Проверка перенаправления на новую страницу
        String expectedUrl27 = "https://vk.com/id1772110"; // Ожидаемый URL
        open(expectedUrl27); // Проверяем, что URL страницы соответствует ожидаемому

        //Возврат
        open("https://vk.com/club225299895");

        // Нажатие на иконку подписчика
        SelenideElement buttonElement28 = $(By.xpath("//div[@id='group_followers']/div[2]//div[@class='people_cell_ava people_cell_ava_rich']/a[@href='/id1772110']")); // Находим кнопку
        buttonElement28.click(); // Нажимаем на кнопку
        // Проверка перенаправления на новую страницу
        String expectedUrl28 = "https://vk.com/id1772110"; // Ожидаемый URL
        open(expectedUrl28); // Проверяем, что URL страницы соответствует ожидаемому

        //Возврат
        open("https://vk.com/club225299895");

        // Проверка открытия и закрытия по крестику модального окна при нажатии на надпись "Контакты"
        SelenideElement contactsLabel = $(By.cssSelector("div#group_contacts .fl_l.header_label"));
        contactsLabel.click();// Клик по надписи "Контакты"
        SelenideElement modal1 = $(By.xpath("//*[@id='box_layer']/div[2]/div")).shouldBe(visible, Duration.ofSeconds(5));// Ожидание появления модального окна
        assertTrue(modal1.isDisplayed());// Проверка, что модальное окно открылось
        SelenideElement closeIcon1 = modal1.$(By.cssSelector("div[role='button']"));// Поиск иконки закрытия окна
        closeIcon1.click();// Клик по иконке закрытия
        assertFalse(modal.isDisplayed()); // Проверка, что модальное окно закрылось

        // Проверка открытия и закрытия по кнопке закрыть модального окна при нажатии на надпись "Контакты"
        SelenideElement contactsLabel1 = $(By.cssSelector("div#group_contacts .fl_l.header_label"));
        contactsLabel1.click();// Клик по надписи "Контакты"
        SelenideElement modal2 = $(By.xpath("//*[@id='box_layer']/div[2]/div")).shouldBe(visible, Duration.ofSeconds(5));// Ожидание появления модального окна
        assertTrue(modal2.isDisplayed());// Проверка, что модальное окно открылось
        SelenideElement closeIcon2 = modal2.$(By.cssSelector(".box_controls_buttons .FlatButton__content"));// Поиск иконки закрытия окна
        closeIcon2.click();// Клик по иконке закрытия
        assertFalse(modal.isDisplayed()); // Проверка, что модальное окно закрылось

        //Возврат
        open("https://vk.com/club225299895");

        // Нажатие на иконку контакта
        SelenideElement buttonElement29 = $(By.xpath("//div[@id='group_contacts']//a[@href='/id1772110']//span")); // Находим кнопку
        buttonElement29.click(); // Нажимаем на кнопку
        // Проверка перенаправления на новую страницу
        String expectedUrl29 = "https://vk.com/id1772110"; // Ожидаемый URL
        open(expectedUrl29); // Проверяем, что URL страницы соответствует ожидаемому

        //Возврат
        open("https://vk.com/club225299895");

        // Нажатие на надпись контакта
        SelenideElement buttonElement30 = $(By.xpath("//div[@id='group_contacts']//a[@href='/id1772110']/div[@class='fl_l info']")); // Находим кнопку
        buttonElement30.click(); // Нажимаем на кнопку
        // Проверка перенаправления на новую страницу
        String expectedUrl30 = "https://vk.com/id1772110"; // Ожидаемый URL
        open(expectedUrl30); // Проверяем, что URL страницы соответствует ожидаемому

        //Возврат
        open("https://vk.com/club225299895");

        // Нажатие на область рядом с именем контакта (отступ справа на ширину надписи в области контакты)
        SelenideElement buttonElement31 = $(By.xpath("//div[@id='group_contacts']//a[@href='/id1772110']")); // Находим кнопку
        buttonElement31.click(); // Нажимаем на кнопку
        // Проверка перенаправления на новую страницу
        String expectedUrl31 = "https://vk.com/id1772110"; // Ожидаемый URL
        open(expectedUrl31); // Проверяем, что URL страницы соответствует ожидаемому
    }
}