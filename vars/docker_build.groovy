def call(imageName, tag, path) {
    sh "docker build -t ${imageName}:${tag} ${path}"
}
