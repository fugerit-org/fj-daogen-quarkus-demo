# Changelog

All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.1.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

## [Unreleased]

## [1.5.0] - 2024-05-05

### Changed

- quarkus-version 3.10.0
- fj-daogen-version 1.8.2
- fj-version 8.5.9
- type-mapper-time-ng set to enabled (requires fj-daogen 1.8.2+)

## [1.4.3] - 2024-04-22

### Changed

- docker publish with action [Maven container publish](https://github.com/fugerit-org/psychic-actions/blob/main/maven-container-publish/maven-container-publish.md)

## [1.4.2] - 2024-04-21

### Changed

- instruction for uber jar
- quarkus-version 3.9.4

## [1.4.1] - 2024-03-30

### Changed

- quarkus-version 3.9.1
- fj-daogen-version 1.8.1
- lombok-version set to 1.18.32

## [1.4.0] - 2024-03-16

### Changed

- app startup early fail
- fj-daogen-version set to 1.8.0
- fj-version set to 8.5.3
- dao-finder-ng-mode 'enabled'
- quarkus version set to 3.8.3

## [1.3.0] - 2024-03-08

### Added

- docker image badge

### Changed

- quarkus version set to 3.8.2
- fj-daogen-version set to 1.7.3
- fj-version set to 8.5.1
- virtual field example

### Removed

- struct generation

### Fixed

- readme now states that GraalVM 21+ is needed to build, java 21+ is needed to run 

## [1.2.0] - 2024-03-04

### Added

- build native image workflow for amd64

### Fixed

- relative link in home page

## [1.1.0] - 2024-03-02

## Added

- info to build / run in README
- quarkus native image build support
- fj-daogen-version set to 1.6.3 (native reflect config generation)
- lombok version 1.18.30

### Fixed

- build-helper-maven-plugin-version referenced
- reflect config to serialize rest response

## [1.0.0] - 2024-02-28

## Added

- sample demo app for fj-daogen version 1.5.1
- project based on quarkus 3.8.1
- docker_publish workflow
