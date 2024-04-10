import fs from 'fs';

class OntologyParser {
  constructor(filePath, ontology_name) {
    this.filePath = filePath;
    this.ontologyName = ontology_name;
    this.data = null;
    this.graphUri = null;
    this.constraints = null;
    this.classes = null;
    this.properties = null;
    this.annotationProperties = null;
    this.classesCount = null;

  }

  readFile() {
    return new Promise((resolve, reject) => {
      fs.readFile(this.filePath, 'utf8', (err, data) => {
        if (err) {
          reject(err);
        } else {
          resolve(data);
        }
      });
    });
  }

  parseData() {
    try {
      this.data = JSON.parse(this.data);

      const ontologyInfo = this.data[this.ontologyName];
      this.graphUri = ontologyInfo.graphUri;
      this.constraints = ontologyInfo.constraints;
      this.classes = ontologyInfo.classes;
      this.properties = ontologyInfo.properties;
      this.annotationProperties = ontologyInfo.annotationProperties;
      this.classesCount = ontologyInfo.classesCount;
    } catch (error) {
      throw new Error('Error parsing JSON:', error);
    }
  }

  async initialize() {
    try {
      this.data = await this.readFile();
      this.parseData();
    } catch (error) {
        console.error('Error initializing OntologyParser:', error); // Log the error
        throw error; // Rethrow the error
    }
  }
}

export default OntologyParser;
