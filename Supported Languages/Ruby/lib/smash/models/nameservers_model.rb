# This file was automatically generated for SMASH by SMASH v2.0
# ( https://smashlabs.io ).

module Smash
  # NameserversModel Model.
  class NameserversModel < BaseModel
    # TODO: Write general description for this method
    # @return [String]
    attr_accessor :ns1

    # TODO: Write general description for this method
    # @return [String]
    attr_accessor :ns2

    # TODO: Write general description for this method
    # @return [String]
    attr_accessor :ns3

    # TODO: Write general description for this method
    # @return [String]
    attr_accessor :ns4

    # A mapping from model property names to API property names.
    def self.names
      if @_hash.nil?
        @_hash = {}
        @_hash['ns1'] = 'ns1'
        @_hash['ns2'] = 'ns2'
        @_hash['ns3'] = 'ns3'
        @_hash['ns4'] = 'ns4'
      end
      @_hash
    end

    def initialize(ns1 = nil,
                   ns2 = nil,
                   ns3 = nil,
                   ns4 = nil,
                   additional_properties = {})
      @ns1 = ns1
      @ns2 = ns2
      @ns3 = ns3
      @ns4 = ns4

      # Add additional model properties to the instance.
      additional_properties.each do |_name, value|
        instance_variable_set("@#{_name}", value)
      end
    end

    # Creates an instance of the object from a hash.
    def self.from_hash(hash)
      return nil unless hash

      # Extract variables from the hash.
      ns1 = hash['ns1']
      ns2 = hash['ns2']
      ns3 = hash['ns3']
      ns4 = hash['ns4']

      # Clean out expected properties from Hash.
      names.each_value { |k| hash.delete(k) }

      # Create object from extracted values.
      NameserversModel.new(ns1,
                           ns2,
                           ns3,
                           ns4,
                           hash)
    end
  end
end
