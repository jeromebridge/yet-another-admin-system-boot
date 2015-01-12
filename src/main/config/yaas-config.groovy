yaas{
    db {
        host = 'localhost'
        port = 5432
        name = 'yaas'
        user = 'postgres'
        password = 'postgres'
    }
}

environments {
    docker {
        yaas {
            db {
                host = 'db'
            }
        }
    }
}
