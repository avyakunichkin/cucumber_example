# language: ru
Функция: Авторизация

  Сценарий: Пользователем

    Дано открыта "главная страница"
    Когда вводим емейл роли <пользователь>
    И вводим пароль роли <пользователь>
    И нажимаем кнопку "Войти"
    Тогда в меню количество элементов: 3

  Сценарий: Администратором

    Дано открыта "главная страница"
    Когда вводим емейл роли <администратор>
    И вводим пароль роли <администратор>
    И нажимаем кнопку "Войти"
    Тогда пункт "Сотрудники" должен быть виден в меню

  Сценарий: Администратором с API

    Дано открыта "главная страница"
    Когда вводим емейл роли <администратор API>
    И вводим пароль роли <администратор API>
    И нажимаем кнопку "Войти"
    Тогда пункт "Управление API" должен быть виден в меню

  Сценарий: Менеджером

    Дано открыта "главная страница"
    Когда вводим емейл роли <менеджер>
    И вводим пароль роли <менеджер>
    И нажимаем кнопку "Войти"
    Тогда пункт "Компании" должен быть виден в меню