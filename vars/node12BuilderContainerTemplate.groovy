def call() {
  return [
    containerTemplate(
      name: 'node12-builder',
      image: 'cypress/base:12.14',
      alwaysPullImage: true,
      command: 'cat',
      ttyEnabled: true
    )
  ]
}
