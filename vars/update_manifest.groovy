def call(String filePath, String image, String tag) {
    sh """
        sed -i 's|image:.*|image: ${image}:${tag}|' ${filePath}
    """
}
